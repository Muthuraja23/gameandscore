package com.chainsys.gameandscore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "teamplayerdetails")
public class TeamPlayerDetails {
	@Id
	@Column(name = "team_player_id")
	private int teamplayerid;
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "team")
	private String team;
	@Column(name = "player_id")
	private int playerid;
	@Column(name = "name")
	private String name;
	@Column(name = "date_of_joining")
	private Date dateofjoining;
	@Column(name = "status")
	private String status;
	@Column(name = "date_of_leaving")
	private String dateofleaving;
	
	
	public int getTeamplayerid() {
		return teamplayerid;
	}
	public void setTeamplayerid(int teamplayerid) {
		this.teamplayerid = teamplayerid;
	}	
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDateofleaving() {
		return dateofleaving;
	}
	public void setDateofleaving(String dateofleaving) {
		this.dateofleaving = dateofleaving;
	}

}
