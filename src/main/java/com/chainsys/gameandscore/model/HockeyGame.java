package com.chainsys.gameandscore.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table()
public class HockeyGame {
    @Id
    @Column(name = "")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "h_game_id")
    @SequenceGenerator(name = "h_game_id", sequenceName = "h_game_id", allocationSize = 1)
    private int game_id;
    @Column(name = "")
    private int sportsid;
    @Column(name = "")
    private String match;
    @Column(name = "")
    private Date date;
    @Column(name = "")
    private String result;
   
   
    public int getGame_id() {
        return game_id;
    }
    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }
    public int getSportsid() {
        return sportsid;
    }
    public void setSportsid(int sportsid) {
        this.sportsid = sportsid;
    }
    public String getMatch() {
        return match;
    }
    public void setMatch(String match) {
        this.match = match;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }



}
