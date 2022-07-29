package com.chainsys.gameandscore.pojo;

import java.util.Date;

public class TeamPlayerDetails {
	private int team_id;
	private int player_id;
	private Date date_of_joining;
	private String status;
	private Date date_of_leaving;

	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public Date getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate_of_leaving() {
		return date_of_leaving;
	}
	public void setDate_of_leaving(Date date_of_leaving) {
		this.date_of_leaving = date_of_leaving;
	}
}
