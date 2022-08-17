package com.chainsys.gameandscore.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "game")
public class Game {
	@Id
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "sports_id")
	private int sportsid;
	@Column(name = "game_between")
	private String gamebetween;
	@Column(name = "time_")
	private Timestamp dateandtime;
	@Column(name = "result")
	private String result;

	@OneToMany(
			mappedBy = "game",
			cascade = CascadeType.ALL
			)
	
	private List<FootballScoreboard>footballScoreboards = new ArrayList<>();

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public int getSportsid() {
		return sportsid;
	}

	public void setSportsid(int sportsid) {
		this.sportsid = sportsid;
	}

	public String getGamebetween() {
		return gamebetween;
	}

	public void setGamebetween(String gamebetween) {
		this.gamebetween = gamebetween;
	}

	public Timestamp getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(Timestamp dateandtime) {
		this.dateandtime = dateandtime;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<FootballScoreboard> getFootballScoreboards() {
		return footballScoreboards;
	}

	public void setFootballScoreboards(List<FootballScoreboard> footballScoreboards) {
		this.footballScoreboards = footballScoreboards;
	}


	

}
