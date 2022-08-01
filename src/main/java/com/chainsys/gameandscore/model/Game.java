package com.chainsys.gameandscore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "game")
public class Game {
	@Id
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "game_name")
	private String gamename;
	@Column(name = "sports_id")
	private int sportsid;
	@Column(name = "start_date")
	private Date startdate;
	@Column(name = "start_time")
	private Date starttime;
	@Column(name = "end_date")
	private Date enddate;
	@Column(name = "end_time")
	private Date endtime;
	@Column(name = "result")
	private String result;
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public String getGamename() {
		return gamename;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	public int getSportsid() {
		return sportsid;
	}
	public void setSportsid(int sportsid) {
		this.sportsid = sportsid;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
