package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "football_scoreboard")
public class FootballScoreboard {
	@Id
	@Column (name = "fb_scoreboard_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "football_score")
    @SequenceGenerator(name = "football_score", sequenceName = "football_score", allocationSize = 1)
	private int fbscoreboardid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "match_between")
	private String matchbetween;
	@Column(name = "team1_score")
	private int team1score;
	@Column(name = "team2_score")
	private int team2score;
	@Column(name = "result")
	private String result;
	
	@ManyToOne
	@JoinColumn(name = "game_id", insertable = false,updatable = false,nullable = false)
	private Game game;

	public int getFbscoreboardid() {
		return fbscoreboardid;
	}

	public void setFbscoreboardid(int fbscoreboardid) {
		this.fbscoreboardid = fbscoreboardid;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getMatchbetween() {
		return matchbetween;
	}

	public void setMatchbetween(String matchbetween) {
		this.matchbetween = matchbetween;
	}

	public int getTeam1score() {
		return team1score;
	}

	public void setTeam1score(int team1score) {
		this.team1score = team1score;
	}

	public int getTeam2score() {
		return team2score;
	}

	public void setTeam2score(int team2score) {
		this.team2score = team2score;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	

	
}
