package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_scoreboard")
public class CrScoreboard {
	@Id
	@Column(name = "s_no")
	private int sno;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "total_runs")
	private int totalruns;
	@Column(name = "overs")
	private float overs;
	@Column(name = "total_wickets")
	private int totalwickets;
	@Column(name = "result")
	private String result;
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
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
	public int getTotalruns() {
		return totalruns;
	}
	public void setTotalruns(int totalruns) {
		this.totalruns = totalruns;
	}
	public float getOvers() {
		return overs;
	}
	public void setOvers(float overs) {
		this.overs = overs;
	}
	public int getTotalwickets() {
		return totalwickets;
	}
	public void setTotalwickets(int totalwickets) {
		this.totalwickets = totalwickets;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}


}
