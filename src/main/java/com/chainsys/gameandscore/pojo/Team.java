package com.chainsys.gameandscore.pojo;

import java.util.Date;

public class Team {
	private int team_id;
	private String team_name;
	private Date start_date;
	private int total_players;
	private String country;
	private String state;
	private String address;
	private String status;
	private String owner;
	private long owner_phone;
	private String owner_email;
	
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public int getTotal_players() {
		return total_players;
	}
	public void setTotal_players(int total_players) {
		this.total_players = total_players;
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
	public long getOwner_phone() {
		return owner_phone;
	}
	public void setOwner_phone(long owner_phone) {
		this.owner_phone = owner_phone;
	}
	public String getOwner_email() {
		return owner_email;
	}
	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}
}
