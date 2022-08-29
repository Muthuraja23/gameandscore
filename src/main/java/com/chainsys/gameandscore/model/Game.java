package com.chainsys.gameandscore.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "game")
public class Game {
	@Id
	@Column(name = "game_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "game_id_seq")
    @SequenceGenerator(name = "game_id_seq", sequenceName = "game_id_seq", allocationSize = 1)
	private int gameid;
	@Column(name = "sports_id")
	private int sportsid;
	@Column(name = "teamA")
	private String teamA;
	@Column(name = "teamB")
	private String teamB;
	@Column(name = "game_date")
	private Date dateandtime;
	@Column(name = "result")
	private String result;
	
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

	public String getTeamA() {
		return teamA;
	}

	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}

	public String getTeamB() {
		return teamB;
	}

	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}

	public Date getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(Date dateandtime) {
		this.dateandtime = dateandtime;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}



	@OneToMany(
			mappedBy = "game",
			cascade = CascadeType.ALL
			)
	
	private List<FootballScoreboard>footballScoreboards = new ArrayList<>();

	
	public List<FootballScoreboard> getFootballScoreboards() {
		return footballScoreboards;
	}

	public void setFootballScoreboards(List<FootballScoreboard> footballScoreboards) {
		this.footballScoreboards = footballScoreboards;
	}


	

}
