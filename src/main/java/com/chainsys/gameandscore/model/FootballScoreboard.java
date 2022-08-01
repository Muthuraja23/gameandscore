package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "football_scoreboard")
public class FootballScoreboard {
	@Id
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "goals_scored")
	private int goalscored;
	@Column(name = "result")
	private String result;
	
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public int getGoalscored() {
		return goalscored;
	}
	public void setGoalscored(int goalscored) {
		this.goalscored = goalscored;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
