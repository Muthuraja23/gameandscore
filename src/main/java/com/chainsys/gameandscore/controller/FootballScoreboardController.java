package com.chainsys.gameandscore.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.gameandscore.model.FootballScoreboard;
import com.chainsys.gameandscore.service.FootballScoreboardService;

@Controller
@RequestMapping("/football")
public class FootballScoreboardController {
	@Autowired
	private FootballScoreboardService fsservice;

	@GetMapping("/getscore")
	public String getFbscore(@RequestParam("id")int gameId,Model model) {
		List<FootballScoreboard> fbscore = fsservice.findByGameId(gameId);
		model.addAttribute("score", fbscore);
		return "footballscoreboard-list";
	}
@GetMapping("/addform")
public String teamAddForm(Model model) {
	FootballScoreboard f=new FootballScoreboard();
	model.addAttribute("addscore", f);
	return "add-footballscoreboard-form";
}
@PostMapping("/add")
public String addFbScore(@ModelAttribute("addscore")FootballScoreboard fs) {
	fsservice.save(fs);
	return "redirect:/football/getscore";
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
    return "redirect:/football/getscore";
}
@GetMapping("/deletescore")
public String deleteTeam(@RequestParam("fbscoreboardid") int id) {
	fsservice.deleteById(id);
	return "redirect:/football/getscore";
}
}
