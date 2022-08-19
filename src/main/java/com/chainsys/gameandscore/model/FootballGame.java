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
@Table(name = "football_game")
public class FootballGame {
    @Id
    @Column(name = "game_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "fb_game_id")
    @SequenceGenerator(name = "fb_game_id", sequenceName = "fb_game_id", allocationSize = 1)
    private int gameid;
    @Column(name = "sports_id")
    private int sportsid;
    @Column(name = "match")
    private String match;
    @Column(name = "date_")
    private Date date;
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
