package com.chainsys.gameandscore.pojo;

public class Football_scoreboard {
	private int game_id;
	private int team_id;
	private int goals_scored;
	private String result;
	
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getGoals_scored() {
		return goals_scored;
	}
	public void setGoals_scored(int goals_scored) {
		this.goals_scored = goals_scored;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
