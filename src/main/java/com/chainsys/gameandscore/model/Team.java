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
	private int totallayers;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "address")
	private String address;
	@Column(name = "status")
	private String status;
	@Column(name = "owner")
	private String owner;
	@Column(name = "owner_phone")
	private long ownerphone;
	@Column(name = "owner_email")
	private String owneremail;
	
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
	public int getTotallayers() {
		return totallayers;
	}
	public void setTotallayers(int totallayers) {
		this.totallayers = totallayers;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public long getOwnerphone() {
		return ownerphone;
	}
	public void setOwnerphone(long ownerphone) {
		this.ownerphone = ownerphone;
	}
	public String getOwneremail() {
		return owneremail;
	}
	public void setOwneremail(String owneremail) {
		this.owneremail = owneremail;
	}
	
}
