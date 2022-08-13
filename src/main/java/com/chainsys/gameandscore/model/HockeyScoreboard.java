package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hockey_scoreboard")
public class HockeyScoreboard {
	@Id
	private int hscoreboardid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "match_between")
	private String matchbetween;
	@Column(name = "team1_score")
	private int team1score;
	@Column(name = "team2_score")
	private int team2score;
	@Column(name = "result")
	private String result;
	
	
	public int getHscoreboardid() {
		return hscoreboardid;
	}
	public void setHscoreboardid(int hscoreboardid) {
		this.hscoreboardid = hscoreboardid;
	}
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public String getMatchbetween() {
		return matchbetween;
	}
	public void setMatchbetween(String matchbetween) {
		this.matchbetween = matchbetween;
	}
	public int getTeam1score() {
		return team1score;
	}
	public void setTeam1score(int team1score) {
		this.team1score = team1score;
	}
	public int getTeam2score() {
		return team2score;
	}
	public void setTeam2score(int team2score) {
		this.team2score = team2score;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

	
}
