package com.chainsys.gameandscore.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chainsys.gameandscore.model.FootballScoreboard;
import com.chainsys.gameandscore.model.Game;

public class GameFootBallDTO {
    @Autowired
	private Game game;
	private List<FootballScoreboard>footballScoreboardslist = new ArrayList<>();
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public List<FootballScoreboard> getFootballScoreboards() {
		return footballScoreboardslist;
	}
	public void setFootballScoreboards(FootballScoreboard footballScoreboards) {
		footballScoreboardslist.add(footballScoreboards);
	}
	
	
}
