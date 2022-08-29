package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.gameandscore.businesslogic.Logic;
import com.chainsys.gameandscore.model.BattingDetails;
import com.chainsys.gameandscore.model.BowlingDetails;
import com.chainsys.gameandscore.model.CricketScoreboard;
import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Team;
import com.chainsys.gameandscore.repository.CricketScoreboardRepository;

@Service
public class CricketScoreboardService {

	@Autowired
	private CricketScoreboardRepository rp;
	@Autowired
	private GameService gameService;
	@Autowired
	private BattingDetailsService battingDetailsService;
	@Autowired
	private BowlingDetailsService bowlingDetailsService;
	@Autowired
	private TeamService teamService;
	
	public List<CricketScoreboard> getScore(int id) {
		return rp.findByGameid(id);
	}

	public CricketScoreboard save(CricketScoreboard cs) {
		return rp.save(cs);
	}

	public CricketScoreboard findById(int id) {
		return rp.findById(id);
	}

	public void deleteById(int id) {
		rp.deleteById(id);
	}
	public CricketScoreboard getScoreByCalculation(int gameId) {
		CricketScoreboard crScoreboard=new CricketScoreboard();
		Game game=gameService.findById(gameId);
		Team teamA =teamService.getTeamByName(game.getTeamA());
		Team teamB =teamService.getTeamByName(game.getTeamB());
		List<BattingDetails> teamABatting = battingDetailsService.getCrSbBattingDetails(gameId,teamA.getTeamname());
		List<BowlingDetails> teamBBowling = bowlingDetailsService.getBowlingByGameId(gameId,teamB.getTeamname());
		List<BattingDetails> teamBBatting = battingDetailsService.getCrSbBattingDetails(gameId,teamB.getTeamname());
		List<BowlingDetails> teamABowling = bowlingDetailsService.getBowlingByGameId(gameId,teamA.getTeamname());
		crScoreboard.setGameid(gameId);
		crScoreboard.setMatchbetween(teamA.getTeamname()+" vs "+teamB.getTeamname());
		int teamAscore=Logic.getTotalScore(teamABatting);
		int teamBscore=Logic.getTotalWicket(teamABatting);
		crScoreboard.setTeam1(teamAscore+"/"+teamBscore);
		crScoreboard.setTeam2(Logic.getTotalScore(teamBBatting)+"/"+Logic.getTotalWicket(teamBBatting));
		crScoreboard.setOversbyt1(Logic.getTotalOver(teamABowling));
		crScoreboard.setOversbyt2(Logic.getTotalOver(teamBBowling));
		crScoreboard.setResult(Logic.getResult(crScoreboard, teamA, teamB));
		game.setResult(crScoreboard.getResult());
		gameService.save(game);
		return crScoreboard;
	}

}
