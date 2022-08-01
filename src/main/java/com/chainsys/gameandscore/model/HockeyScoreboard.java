package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hockey_scoreboard")
public class HockeyScoreboard {
	@Id
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "goals_scored")
	private int goalsscored;
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
	public int getGoalsscored() {
		return goalsscored;
	}
	public void setGoalsscored(int goalsscored) {
		this.goalsscored = goalsscored;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
