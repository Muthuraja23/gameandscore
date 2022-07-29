package com.chainsys.gameandscore.pojo;

public class Sports {
	private int sports_id;
	private String sports_name;
	private int no_of_teams_per_game;
	private int max_players_perteam;

	public int getSports_id() {
		return sports_id;
	}
	public void setSports_id(int sports_id) {
		this.sports_id = sports_id;
	}
	public String getSports_name() {
		return sports_name;
	}
	public void setSports_name(String sports_name) {
		this.sports_name = sports_name;
	}
	public int getNo_of_teams_per_game() {
		return no_of_teams_per_game;
	}
	public void setNo_of_teams_per_game(int no_of_teams_per_game) {
		this.no_of_teams_per_game = no_of_teams_per_game;
	}
	public int getMax_players_perteam() {
		return max_players_perteam;
	}
	public void setMax_players_perteam(int max_players_perteam) {
		this.max_players_perteam = max_players_perteam;
	}
}
