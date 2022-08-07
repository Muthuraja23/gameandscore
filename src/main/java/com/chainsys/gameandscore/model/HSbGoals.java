package com.chainsys.gameandscore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "h_sb_goals")
public class HSbGoals {
	@Id
	@Column(name = "h_goals_id")
	private int hgoalsid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team")
	private String team;
	@Column(name = "player_name")
	private String playername;
	@Column(name = "goal_scored")
	private int goalscored;
	@Column(name = "time")
	private Date time;
	@Column(name = "fouls")
	private int fouls;
	@Column(name = "tackles")
	private int tackles;
	@Column(name = "assist")
	private int assist;
	@Column(name = "goal_attempt")
	private int goalsattempt;
	@Column(name = "penalty")
	private int penalty;
	@Column(name = "corners")
	private int corners;
	public int getHgoalsid() {
		return hgoalsid;
	}
	public void setHgoalsid(int hgoalsid) {
		this.hgoalsid = hgoalsid;
	}
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getGoalscored() {
		return goalscored;
	}
	public void setGoalscored(int goalscored) {
		this.goalscored = goalscored;
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
	public int getGoalsattempt() {
		return goalsattempt;
	}
	public void setGoalsattempt(int goalsattempt) {
		this.goalsattempt = goalsattempt;
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
