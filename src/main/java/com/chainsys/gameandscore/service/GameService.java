package com.chainsys.gameandscore.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.dto.GameFootBallDTO;
import com.chainsys.gameandscore.model.FootballScoreboard;
import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.repository.FootballScoreboardRepository;
import com.chainsys.gameandscore.repository.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository repo;
	@Autowired
	private FootballScoreboardRepository repository;
	public List<Game> getGame(int id) {
		return repo.findBySportsid(id);
	}
	public Game save(Game gm) {
		return repo.save(gm);
	}
	public Game findById(int id) {
		return repo.findById(id);
	}
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	
	public GameFootBallDTO getGameFootBall(int id) {
		GameFootBallDTO dto = new GameFootBallDTO();
		Game game = findById(id);
		dto.setGame(game);
		List<FootballScoreboard> footballScoreboard = repository.findAll();
		Iterator<FootballScoreboard> itr = footballScoreboard.iterator();
		while(itr.hasNext()) {
			dto.setFootballScoreboards(itr.next());
		}
		return dto;
	}
}
