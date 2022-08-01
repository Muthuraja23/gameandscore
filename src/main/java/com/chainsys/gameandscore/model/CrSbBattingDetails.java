package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_sb_batting_details")
public class CrSbBattingDetails {
	@Id
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "player_id")
	private int playerid;
	@Column(name = "runs_scored")
	private int runsscored;
	@Column(name = "balls_faced")
	private int ballsfaced;
	@Column(name = "fours")
	private int fours;
	@Column(name = "sixes")
	private int sixes;
	@Column(name = "dot_balls")
	private int dotballs;
	@Column(name = "status")
	private String status;
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
	public int getDotballs() {
		return dotballs;
	}
	public void setDotballs(int dotballs) {
		this.dotballs = dotballs;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
