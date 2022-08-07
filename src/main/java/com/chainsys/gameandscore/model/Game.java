package com.chainsys.gameandscore.model;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "game")
public class Game {
	@Id
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "game_between")
	private String gamebetween;
	@Column(name = "sports_id")
	private int sportsid;
	@Column(name = "date_")
	private Date date;
	@Column(name = "time_")
	private Timestamp time;
	@Column(name = "result")
	private String result;

	
	public int getGameid() {
		return gameid;
	}
	public void setGameid(int gameid) {
		this.gameid = gameid;
	}
	public String getGamebetween() {
		return gamebetween;
	}
	public void setGamename(String gamebetween) {
		this.gamebetween= gamebetween;
	}
	public int getSportsid() {
		return sportsid;
	}
	public void setSportsid(int sportsid) {
		this.sportsid = sportsid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sports_id",insertable = false,nullable = false,updatable = false)
	
	private Sports sports;
	
	/*public Sports getSports() {
		return sports;
	}
	public void setSports(Sports sports) {
		this.sports = sports;
	}  */
}
