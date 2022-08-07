package com.chainsys.gameandscore.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Sports;

public class SportsGameDto {
	@Autowired
	private Sports sports;
	private List<Game> gameList = new ArrayList<Game>();
	public Sports getSports() {
		return sports;
	}
	public void setSports(Sports sports) {
		this.sports = sports;
	}
	public List<Game> getGameList(){
		return gameList;
	}
	public void addSportsAndGameList(Game game) {
		gameList.add(game);
	}
	

}
