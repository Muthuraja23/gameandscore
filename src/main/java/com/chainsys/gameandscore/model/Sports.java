package com.chainsys.gameandscore.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "sports")
public class Sports {
	@Id
	@Column(name = "sports_id")
	private int sportsid;
	@Column(name = "sports_name")
	private String sportsname;
	@Column(name = "no_of_teams_participating")
	private int noofteamsparticipating;
	
	
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
	public int getNoofteamsparticipating() {
		return noofteamsparticipating;
	}
	public void setNoofteamsparticipating(int noofteamsparticipating) {
		this.noofteamsparticipating = noofteamsparticipating;
	}






	@OneToMany(mappedBy = "sports",fetch = FetchType.LAZY)

	List<Game> game;
	
	public List<Game> getGame() {
		return game;
	}
	public void setGame(List<Game> game) {
		this.game = game;
	}
	
	

}
