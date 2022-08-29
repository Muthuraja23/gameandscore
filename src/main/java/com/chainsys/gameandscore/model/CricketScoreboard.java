package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cr_scoreboard")
public class CricketScoreboard {
	@Id
	@Column(name = "cr_scoreboard_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "cr_score_id")
    @SequenceGenerator(name = "cr_score_id", sequenceName = "cr_score_id", allocationSize = 1)
	private int crscoreboardid;
	@Column(name = "game_id")
	private int gameid;
	@Column(name = "match_between")
	private String matchbetween;
	@Column(name = "team1")
	private String team1;
	@Column(name = "overs_by_t1")
	private float oversbyt1;
	@Column(name = "team2")
	private String team2;
	@Column(name = "overs_by_t2")
	private float oversbyt2;
	@Column(name = "result")
	private String result;

	public int getCrscoreboardid() {
		return crscoreboardid;
	}

	public void setCrscoreboardid(int crscoreboardid) {
		this.crscoreboardid = crscoreboardid;
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

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public float getOversbyt1() {
		return oversbyt1;
	}

	public void setOversbyt1(float oversbyt1) {
		this.oversbyt1 = oversbyt1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public float getOversbyt2() {
		return oversbyt2;
	}

	public void setOversbyt2(float oversbyt2) {
		this.oversbyt2 = oversbyt2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
