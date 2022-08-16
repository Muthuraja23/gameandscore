package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hockey_scoreboard")
public class HockeyScoreboard {
	@Id
	@Column(name = "h_scoreboard_id")
	private int hscoreboardid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team1")
	private String team1;
	@Column(name = "t1_period1")
	private int t1period1;
	@Column(name = "t1_period2")
	private int t1period2;
	@Column(name = "t1_period3")
	private int t1period3;
	@Column(name = "t1_ot")
	private int t1ot;
	@Column(name = "t1_total")
	private int t1total;
	@Column(name = "team2")
	private String team2;
	@Column(name = "t2_period1")
	private int t2period1;
	@Column(name = "t2_period2")
	private int t2period2;
	@Column(name = "t2_period3")
	private int t2period3;
	@Column(name = "t2_ot")
	private int t2ot;
	@Column(name = "t2_total")
	private int t2total;
	
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
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public int getT1period1() {
		return t1period1;
	}
	public void setT1period1(int t1period1) {
		this.t1period1 = t1period1;
	}
	public int getT1period2() {
		return t1period2;
	}
	public void setT1period2(int t1period2) {
		this.t1period2 = t1period2;
	}
	public int getT1period3() {
		return t1period3;
	}
	public void setT1period3(int t1period3) {
		this.t1period3 = t1period3;
	}
	public int getT1ot() {
		return t1ot;
	}
	public void setT1ot(int t1ot) {
		this.t1ot = t1ot;
	}
	public int getT1total() {
		return t1total;
	}
	public void setT1total(int t1total) {
		this.t1total = t1total;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public int getT2period1() {
		return t2period1;
	}
	public void setT2period1(int t2period1) {
		this.t2period1 = t2period1;
	}
	public int getT2period2() {
		return t2period2;
	}
	public void setT2period2(int t2period2) {
		this.t2period2 = t2period2;
	}
	public int getT2period3() {
		return t2period3;
	}
	public void setT2period3(int t2period3) {
		this.t2period3 = t2period3;
	}
	public int getT2ot() {
		return t2ot;
	}
	public void setT2ot(int t2ot) {
		this.t2ot = t2ot;
	}
	public int getT2total() {
		return t2total;
	}
	public void setT2total(int t2total) {
		this.t2total = t2total;
	}
	
	
	
}
