package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cr_sb_bowling_details")
public class CrSbBowlingDetails {
	@Id
	@Column(name = "cr_bowling_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "bowling_id")
    @SequenceGenerator(name = "bowling_id", sequenceName = "bowling_id", allocationSize = 1)
	private int crbowlingid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team")
	private String team;
	@Column(name = "player_name")
	private String playerName;
	@Column(name = "overs")
	private float overs;
	@Column(name = "wickets")
	private int wickets;
	@Column(name = "runs")
	private int runs;
	@Column(name = "maiden")
	private int maiden;
	@Column(name = "economy")
	private float economy;
	
	public int getCrbowlingid() {
		return crbowlingid;
	}
	public void setCrbowlingid(int crbowlingid) {
		this.crbowlingid = crbowlingid;
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
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public float getOvers() {
		return overs;
	}
	public void setOvers(float overs) {
		this.overs = overs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getMaiden() {
		return maiden;
	}
	public void setMaiden(int maiden) {
		this.maiden = maiden;
	}
	public float getEconomy() {
		return economy;
	}
	public void setEconomy(float economy) {
		this.economy = economy;
	}

	
}
