package com.chainsys.gameandscore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.gameandscore.model.FootballGoals;
import com.chainsys.gameandscore.model.FootballScoreboard;
import com.chainsys.gameandscore.service.FootballGoalsService;
import com.chainsys.gameandscore.service.FootballScoreboardService;

@Controller
@RequestMapping("/football")
public class FootballScoreboardController {
	public static final String LISTOFFOOTBALL = "redirect:/football/getscore";
	@Autowired
	private FootballScoreboardService fsservice;
	@Autowired
	private FootballGoalsService fsgservice;

	@GetMapping("/getscore")
	public String getFbscore(@RequestParam("id")int gameId,Model model) {
		List<FootballScoreboard> fbscore = fsservice.getfbscoreboard(gameId);
		model.addAttribute("score", fbscore);
		List<FootballGoals> goallist = fsgservice.getGoalsByGameId(gameId);
		model.addAttribute("goals", goallist);
		return "footballscoreboard-list";
	}
@GetMapping("/addform")
public String teamAddForm(@RequestParam("sportsId")int sportsId,Model model) {
	FootballScoreboard f=new FootballScoreboard();
	model.addAttribute("addscore", f);
	return "add-footballscoreboard-form";
}
@PostMapping("/add")
public String addFbScore(@Valid @ModelAttribute("addscore")FootballScoreboard fs,Errors errors) {
	if (errors.hasErrors()) {
		return "add";
	}
	fsservice.save(fs);
	return LISTOFFOOTBALL;
}
@GetMapping("/updatescore")
public String showUpdateForm(@RequestParam("fbscoreboardid") int id, Model model) {
	FootballScoreboard f = fsservice.findById(id);
    model.addAttribute("updatescore", f);
    return "update-footballscoreboard-form";
}

@PostMapping("/update")
public String updateteam(@ModelAttribute("updatescore") FootballScoreboard f) {
	fsservice.save(f);
    return LISTOFFOOTBALL;
}
@GetMapping("/deletescore")
public String deleteTeam(@RequestParam("fbscoreboardid") int id) {
	fsservice.deleteById(id);
	return LISTOFFOOTBALL;
}
}
