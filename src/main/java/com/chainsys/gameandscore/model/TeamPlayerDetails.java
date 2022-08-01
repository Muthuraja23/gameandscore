package com.chainsys.gameandscore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "team_player_details")
public class TeamPlayerDetails {
	@Id
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "player_id")
	private int playerid;
	@Column(name = "date_of_joining")
	private Date dateofjoining;
	@Column(name = "status")
	private String status;
	@Column(name = "date_of_leaving")
	private Date dateofleaving;
	
	
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
	public Date getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(Date dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateofleaving() {
		return dateofleaving;
	}
	public void setDateofleaving(Date dateofleaving) {
		this.dateofleaving = dateofleaving;
	}

}
