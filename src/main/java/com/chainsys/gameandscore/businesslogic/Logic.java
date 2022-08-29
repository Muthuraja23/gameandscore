package com.chainsys.gameandscore.businesslogic;

import java.time.LocalDate;
import java.util.List;

import com.chainsys.gameandscore.model.BattingDetails;
import com.chainsys.gameandscore.model.BowlingDetails;
import com.chainsys.gameandscore.model.CricketScoreboard;
import com.chainsys.gameandscore.model.Team;

public class Logic {
private Logic() {
}
	public static LocalDate getInstanceDate() {
        return java.time.LocalDate.now();
    }
	public static float getStrickRate(int score,int balls) {
		return score*100/balls;
	}
	public static float getEconomy(int runs,float overs) {
		return runs/overs;
	}
	public static int getTotalScore(List<BattingDetails> battingList) {
		int score=0;
		for(int i=0;i<battingList.size();i++) {
			score+=battingList.get(i).getRunsscored();
		}
		return score;
	}
	public static int getTotalWicket(List<BattingDetails> battingList) {
		int wicket=0;
		for(int i=0;i<battingList.size();i++) {
			if(battingList.get(i).getStatus().equalsIgnoreCase("out"))
				wicket++;
		}
		return wicket;
	}
	public static float getTotalOver(List<BowlingDetails> teamBBowling) {
		float over=0;
		for(int i=0;i<teamBBowling.size();i++) {
				over+=teamBBowling.get(i).getOvers();
		}
		return over;
	}
	public static String getResult(CricketScoreboard crScoreboard,Team teamA,Team teamB) {
		String [] teamAScoreString=crScoreboard.getTeam1().split("/");
		String [] teamBScoreString=crScoreboard.getTeam2().split("/");
		int teamAscore=Integer.parseInt(teamAScoreString[0]);
		int teamBscore=Integer.parseInt(teamBScoreString[0]);
		int teamAwicket=Integer.parseInt(teamAScoreString[1]);
		if(teamAscore>teamBscore) {
			return teamA.getTeamname()+" won by "+(teamAscore-teamBscore)+ " Runs";
		}else {
			return teamB.getTeamname()+" won by "+(10-teamAwicket)+" Wickets";
		}
	}
}