package com.chainsys.gameandscore.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "h_sb_goals")
public class HSbGoals {
	@Id
	@Column(name = "h_goals_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "h_goal_id")
    @SequenceGenerator(name = "h_goal_id", sequenceName = "h_goal_id", allocationSize = 1)
	private int hgoalsid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team1")
	private String team1;
	@Column(name = "t1_shots")
	private int t1shots;
	@Column(name = "t1_hits")
	private int t1hits;
	@Column(name = "t1_totalpenalties")
	private int t1totalpenalties;
	@Column(name = "t1_blockedshots")
	private int t1blockedshots;
	@Column(name = "team2")
	private String team2;
	@Column(name = "t2_shots")
	private int t2shots;
	@Column(name = "t2_hits")
	private int t2hits;
	@Column(name = "t2_totalpenalties")
	private int t2totalpenalties;
	@Column(name = "t2_blockedshots")
	private int t2blockedshots;
	
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
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public int getT1shots() {
		return t1shots;
	}
	public void setT1shots(int t1shots) {
		this.t1shots = t1shots;
	}
	public int getT1hits() {
		return t1hits;
	}
	public void setT1hits(int t1hits) {
		this.t1hits = t1hits;
	}
	public int getT1totalpenalties() {
		return t1totalpenalties;
	}
	public void setT1totalpenalties(int t1totalpenalties) {
		this.t1totalpenalties = t1totalpenalties;
	}
	public int getT1blockedshots() {
		return t1blockedshots;
	}
	public void setT1blockedshots(int t1blockedshots) {
		this.t1blockedshots = t1blockedshots;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public int getT2shots() {
		return t2shots;
	}
	public void setT2shots(int t2shots) {
		this.t2shots = t2shots;
	}
	public int getT2hits() {
		return t2hits;
	}
	public void setT2hits(int t2hits) {
		this.t2hits = t2hits;
	}
	public int getT2totalpenalties() {
		return t2totalpenalties;
	}
	public void setT2totalpenalties(int t2totalpenalties) {
		this.t2totalpenalties = t2totalpenalties;
	}
	public int getT2blockedshots() {
		return t2blockedshots;
	}
	public void setT2blockedshots(int t2blockedshots) {
		this.t2blockedshots = t2blockedshots;
	}
}
