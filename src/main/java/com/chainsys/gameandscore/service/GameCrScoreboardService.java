package com.chainsys.gameandscore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.gameandscore.dto.GameCrScoreboardDto;
import com.chainsys.gameandscore.model.CrScoreboard;
import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.repository.CrScoreboardRepository;
import com.chainsys.gameandscore.repository.GameRepository;

@Service
public class GameCrScoreboardService {
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private CrScoreboardRepository crScoreboardRepository;
	public GameCrScoreboardDto crScoreboardDto(int id) {
		Game game = findById(id);
		GameCrScoreboardDto dto=new GameCrScoreboardDto();
		dto.setGame(game);
	    CrScoreboard crScoreboard = crScoreboardRepository.findById(id);
		return dto;
	}
	public Game findById(int id) {
		return gameRepository.findById(id);
	}
}
