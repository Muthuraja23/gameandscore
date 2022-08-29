package com.chainsys.gameandscore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.gameandscore.model.BattingDetails;
import com.chainsys.gameandscore.model.BowlingDetails;
import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Player;
import com.chainsys.gameandscore.model.Team;
import com.chainsys.gameandscore.service.GameService;
import com.chainsys.gameandscore.service.PlayerService;
import com.chainsys.gameandscore.service.TeamService;
import com.chainsys.gameandscore.service.BattingDetailsService;
import com.chainsys.gameandscore.service.BowlingDetailsService;

@Controller
@RequestMapping("/player")
public class PlayerController {
	public static final String LISTOFPLAYER = "redirect:/player/getallplayers";
	@Autowired
	private PlayerService plservice;
	@Autowired
	private GameService gameService;
	@Autowired
	private TeamService teamSerice;
	@Autowired
	private BattingDetailsService battingDetailsService;
	@Autowired
	private BowlingDetailsService bowlingDetailsService;
	@GetMapping("/getallplayers")
	public String getallplayers(Model model) {
		List<Player> playerlist = plservice.getplayers();
		model.addAttribute("allplayers", playerlist);
		return "player-list";
	}
	@GetMapping("/getallplayersbyteam")
	public String getallplayersByTeam(@RequestParam("id")int gameId,Model model) {
		Game game=gameService.findById(gameId);
		Team teamA =teamSerice.getTeamByName(game.getTeamA());
		Team teamB =teamSerice.getTeamByName(game.getTeamB());
		List<Player> teamAplayerlist = plservice.getPlayersByTeamId(teamA.getTeamid());
		List<Player> teamBplayerlist = plservice.getPlayersByTeamId(teamB.getTeamid());
		List<BattingDetails> teamAbatting=battingDetailsService.getCrSbBattingDetails(gameId,game.getTeamA());
		List<BowlingDetails> teamAbowling=bowlingDetailsService.getBowlingByGameId(gameId,game.getTeamA());
		List<BattingDetails> teamBbatting=battingDetailsService.getCrSbBattingDetails(gameId,game.getTeamB());
		List<BowlingDetails> teamBbowling=bowlingDetailsService.getBowlingByGameId(gameId,game.getTeamB());
		model.addAttribute("teamAplayerlist", teamAplayerlist);
		model.addAttribute("teamBplayerlist", teamBplayerlist);
		model.addAttribute("teamAbatting", teamAbatting);
		model.addAttribute("teamAbowling", teamAbowling);
		model.addAttribute("teamBbatting", teamBbatting);
		model.addAttribute("teamBbowling", teamBbowling);
		model.addAttribute("gameId", gameId);
		return "players-list";
	}
	@GetMapping("/addform")
	public String playerAddForm(Model model) {
		Player player = new Player();
		model.addAttribute("addplayer", player);
		return "add-player-form";
	}
	@GetMapping("/select")
	public String chooseBattingBowling(@RequestParam("id")int gameId,@RequestParam("playerId")int playerId,Model model) {
		
		model.addAttribute("id", gameId);
		model.addAttribute("playerId", playerId);
		return "batting-bowling";
	}
	@PostMapping("/add")
	public String addNewPlayer(@Valid @ModelAttribute("addplayer") Player players,Errors errors) {
		if (errors.hasErrors()) {
            return "add";
	    }
		plservice.save(players);
		return LISTOFPLAYER;
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("playerid") int id, Model model) {
	    Player p = plservice.findById(id);
	    model.addAttribute("updateplayer", p);
	    return "update-player-form";
	}

	@PostMapping("/updateplayer")
	public String updatePlayer(@ModelAttribute("updateplayer") Player player) {
		plservice.save(player);
	    return LISTOFPLAYER;
	}
	@GetMapping("/deleteplayer")
	public String deletePlayer(@RequestParam("playerid") int id) {
		plservice.deleteById(id);
		return LISTOFPLAYER;
	}
	
}
