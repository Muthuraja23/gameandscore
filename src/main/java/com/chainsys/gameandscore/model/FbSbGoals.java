package com.chainsys.gameandscore.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "fb_sb_goals")
public class FbSbGoals {
	@Id
	@Column(name = "fb_goals_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fb_goal_id")
    @SequenceGenerator(name = "fb_goal_id", sequenceName = "fb_goal_id", allocationSize = 1)
	private int fbgoalsid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team1")
	private String team1;
	@Column(name = "t1_fouls")
	private int t1fouls;
	@Column(name = "t1_yr_cards")
	private int t1yrcards;
	@Column(name = "t1_corners")
	private int t1corners;
	@Column(name = "t1_saves")
	private int t1saves;
	@Column(name = "team2")
	private String team2;
	@Column(name = "t2_fouls")
	private int t2fouls;
	@Column(name = "t2_yr_cards")
	private int t2yrcards;
	@Column(name = "t2_corners")
	private int t2corners;
	@Column(name = "t2_saves")
	private int t2saves;
	public int getFbgoalsid() {
		return fbgoalsid;
	}
	public void setFbgoalsid(int fbgoalsid) {
		this.fbgoalsid = fbgoalsid;
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
	public int getT1fouls() {
		return t1fouls;
	}
	public void setT1fouls(int t1fouls) {
		this.t1fouls = t1fouls;
	}
	public int getT1yrcards() {
		return t1yrcards;
	}
	public void setT1yrcards(int t1yrcards) {
		this.t1yrcards = t1yrcards;
	}
	public int getT1corners() {
		return t1corners;
	}
	public void setT1corners(int t1corners) {
		this.t1corners = t1corners;
	}
	public int getT1saves() {
		return t1saves;
	}
	public void setT1saves(int t1saves) {
		this.t1saves = t1saves;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public int getT2fouls() {
		return t2fouls;
	}
	public void setT2fouls(int t2fouls) {
		this.t2fouls = t2fouls;
	}
	public int getT2yrcards() {
		return t2yrcards;
	}
	public void setT2yrcards(int t2yrcards) {
		this.t2yrcards = t2yrcards;
	}
	public int getT2corners() {
		return t2corners;
	}
	public void setT2corners(int t2corners) {
		this.t2corners = t2corners;
	}
	public int getT2saves() {
		return t2saves;
	}
	public void setT2saves(int t2saves) {
		this.t2saves = t2saves;
	}
	
	
	
}
