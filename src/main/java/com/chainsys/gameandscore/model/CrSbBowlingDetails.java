package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_sb_bowling_details")
public class CrSbBowlingDetails {
	@Id
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "player_id")
	private int playerid;
	@Column(name = "overs_bowled")
	private int oversbowled;
	@Column(name = "wickets_taken")
	private int wicketstaken;
	@Column(name = "dot_balls")
	private int dotballs;
	@Column(name = "wides")
	private int wides;
	@Column(name = "noball")
	private int noball;
	@Column(name = "runs_given")
	private int runsgiven;
	@Column(name = "maiden_overs")
	private int maidenovers;
	
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
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public int getOversbowled() {
		return oversbowled;
	}
	public void setOversbowled(int oversbowled) {
		this.oversbowled = oversbowled;
	}
	public int getWicketstaken() {
		return wicketstaken;
	}
	public void setWicketstaken(int wicketstaken) {
		this.wicketstaken = wicketstaken;
	}
	public int getDotballs() {
		return dotballs;
	}
	public void setDotballs(int dotballs) {
		this.dotballs = dotballs;
	}
	public int getWides() {
		return wides;
	}
	public void setWides(int wides) {
		this.wides = wides;
	}
	public int getNoball() {
		return noball;
	}
	public void setNoball(int noball) {
		this.noball = noball;
	}
	public int getRunsgiven() {
		return runsgiven;
	}
	public void setRunsgiven(int runsgiven) {
		this.runsgiven = runsgiven;
	}
	public int getMaidenovers() {
		return maidenovers;
	}
	public void setMaidenovers(int maidenovers) {
		this.maidenovers = maidenovers;
	}
	
}
