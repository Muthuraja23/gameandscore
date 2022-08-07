package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_sb_batting_details")
public class CrSbBattingDetails {
	@Id
	@Column(name = "cr_batting_id")
	private int crbattingid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team")
	private int team;
	@Column(name = "player_name	")
	private int playername;
	@Column(name = "runs_scored")
	private int runsscored;
	@Column(name = "balls_faced")
	private int ballsfaced;
	@Column(name = "fours")
	private int fours;
	@Column(name = "sixes")
	private int sixes;
	@Column(name = "strike_rate")
	private float strikerate;
	@Column(name = "status")
	private String status;
	
	
	public int getCrbattingid() {
		return crbattingid;
	}
	public void setCrbattingid(int crbattingid) {
		this.crbattingid = crbattingid;
	}
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getPlayername() {
		return playername;
	}
	public void setPlayername(int playername) {
		this.playername = playername;
	}
	public int getRunsscored() {
		return runsscored;
	}
	public void setRunsscored(int runsscored) {
		this.runsscored = runsscored;
	}
	public int getBallsfaced() {
		return ballsfaced;
	}
	public void setBallsfaced(int ballsfaced) {
		this.ballsfaced = ballsfaced;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	public float getStrikerate() {
		return strikerate;
	}
	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	

}
