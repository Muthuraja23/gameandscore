package com.chainsys.gameandscore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "player")
public class Player {
	@Id
	@Column(name = "player_id")
	private int playerid;
	@Column(name = "player_name")
	private String playername;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "team_id")
	private int teamid;
	@Column(name = "skill")
	private String skill;
	@Column(name = "player_address")
	private String playeraddress;
	@Column(name = "player_email")
	private String playeremail;
	@Column(name = "player_phone")
	private long playerphone;
	@Column(name = "player_aadhar")
	private long playeraadhar;
	@Column(name = "player_bloodgroup")
	private String playerbloodgroup;
	@Column(name = "player_height")
	private int playerheight;
	@Column(name = "player_weight")
	private int playerweight;
	@Column(name = "player_fees")
	private float playerfees;
	@Column(name = "player_grade")
	private String playergrade;
	
	
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getPlayeraddress() {
		return playeraddress;
	}
	public void setPlayeraddress(String playeraddress) {
		this.playeraddress = playeraddress;
	}
	public String getPlayeremail() {
		return playeremail;
	}
	public void setPlayeremail(String playeremail) {
		this.playeremail = playeremail;
	}
	public long getPlayerphone() {
		return playerphone;
	}
	public void setPlayerphone(long playerphone) {
		this.playerphone = playerphone;
	}
	public long getPlayeraadhar() {
		return playeraadhar;
	}
	public void setPlayeraadhar(long playeraadhar) {
		this.playeraadhar = playeraadhar;
	}
	public String getPlayerbloodgroup() {
		return playerbloodgroup;
	}
	public void setPlayerbloodgroup(String playerbloodgroup) {
		this.playerbloodgroup = playerbloodgroup;
	}
	public int getPlayerheight() {
		return playerheight;
	}
	public void setPlayerheight(int playerheight) {
		this.playerheight = playerheight;
	}
	public int getPlayerweight() {
		return playerweight;
	}
	public void setPlayerweight(int playerweight) {
		this.playerweight = playerweight;
	}
	public float getPlayerfees() {
		return playerfees;
	}
	public void setPlayerfees(float playerfees) {
		this.playerfees = playerfees;
	}
	public String getPlayergrade() {
		return playergrade;
	}
	public void setPlayergrade(String playergrade) {
		this.playergrade = playergrade;
	}
	
	
}
