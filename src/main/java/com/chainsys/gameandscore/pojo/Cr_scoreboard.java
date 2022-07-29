package com.chainsys.gameandscore.pojo;

public class Cr_scoreboard {
	private int s_no;
	private int game_id;
	private int team_id;
	private int total_runs;
	private float overs;
	private int total_wickets;
	private String result;

	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getTotal_runs() {
		return total_runs;
	}
	public void setTotal_runs(int total_runs) {
		this.total_runs = total_runs;
	}
	public float getOvers() {
		return overs;
	}
	public void setOvers(float overs) {
		this.overs = overs;
	}
	public int getTotal_wickets() {
		return total_wickets;
	}
	public void setTotal_wickets(int total_wickets) {
		this.total_wickets = total_wickets;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
