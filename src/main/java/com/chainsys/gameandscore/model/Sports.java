package com.chainsys.gameandscore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "sports")
@RequestMapping("/sports")
public class Sports {
	@Id
	@Column(name = "sports_id")
	private int sportsid;
	@Column(name = "sports_name")
	private String sportsname;
	@Column(name = "no_of_teams_per_game")
	private int noofteamspergame;
	@Column(name = "max_players_perteam")
	private int maxplayersperteam;
	public int getSportsid() {
		return sportsid;
	}
	public void setSportsid(int sportsid) {
		this.sportsid = sportsid;
	}
	public String getSportsname() {
		return sportsname;
	}
	public void setSportsname(String sportsname) {
		this.sportsname = sportsname;
	}
	public int getNoofteamspergame() {
		return noofteamspergame;
	}
	public void setNoofteamspergame(int noofteamspergame) {
		this.noofteamspergame = noofteamspergame;
	}
	public int getMaxplayersperteam() {
		return maxplayersperteam;
	}
	public void setMaxplayersperteam(int maxplayersperteam) {
		this.maxplayersperteam = maxplayersperteam;
	}
	
	


}
