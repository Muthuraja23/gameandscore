package com.chainsys.gameandscore.pojo;

import java.util.Date;

public class Fb_sb_goals {
	private int game_id;
	private int team_id;
	private int player_id;
	private int goal_scored;
	private Date time;
	private int fouls;
	private int tackles;
	private int assist;
	private int goal_attempt;
	private int penalty;
	private int corners;
	
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
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public int getGoal_scored() {
		return goal_scored;
	}
	public void setGoal_scored(int goal_scored) {
		this.goal_scored = goal_scored;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getFouls() {
		return fouls;
	}
	public void setFouls(int fouls) {
		this.fouls = fouls;
	}
	public int getTackles() {
		return tackles;
	}
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	public int getAssist() {
		return assist;
	}
	public void setAssist(int assist) {
		this.assist = assist;
	}
	public int getGoal_attempt() {
		return goal_attempt;
	}
	public void setGoal_attempt(int goal_attempt) {
		this.goal_attempt = goal_attempt;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public int getCorners() {
		return corners;
	}
	public void setCorners(int corners) {
		this.corners = corners;
	}
}
