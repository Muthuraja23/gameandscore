package com.chainsys.gameandscore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "team")
public class Team {
	@Id
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "team_name")
	private String teamname;
	@Column(name = "start_date")
	private Date startdate;
	@Column(name = "total_players")
	private int totalplayers;
	@Column(name = "country")
	private String country;
	@Column(name = "status")
	private String status;
	@Column(name = "owner")
	private String owner;
	@Column(name = "email")
	private String email;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public int getTotalplayers() {
		return totalplayers;
	}
	public void setTotalplayers(int totalplayers) {
		this.totalplayers = totalplayers;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getEmail() {
		return email;
	}
	public void setOwneremail(String email) {
		this.email = email;
	}
	
	
	
	
}
