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

import com.chainsys.gameandscore.model.FootballScoreboard;
import com.chainsys.gameandscore.model.HockeyScoreboard;
import com.chainsys.gameandscore.service.FootballScoreboardService;
import com.chainsys.gameandscore.service.HockeyScoreboardService;


@Controller
@RequestMapping("/hockey")
public class HockeyScoreboardController {
	@Autowired
	private HockeyScoreboardService hsservice;

	@GetMapping("/getscore")
	public String getHscore(Model model) {
		List<HockeyScoreboard> hscore = hsservice.gethscoreboard();
		model.addAttribute("score", hscore);
		return "hockeyscoreboard-list";
	}
@GetMapping("/addform")
public String teamAddForm(Model model) {
	HockeyScoreboard h=new HockeyScoreboard();
	model.addAttribute("addscore", h);
	return "add-hockeyscoreboard-form";
}
@PostMapping("/add")
public String addHScore(@ModelAttribute("addscore")HockeyScoreboard hs) {
	hsservice.save(hs);
	return "redirect:/hockey/getscore";
}
@GetMapping("/updatescore")
public String showUpdateForm(@RequestParam("hscoreboardid") int id, Model model) {
	HockeyScoreboard h = hsservice.findById(id);
    model.addAttribute("updatescore", h);
    return "update-hockeyscoreboard-form";
}

@PostMapping("/update")
public String updateteam(@ModelAttribute("updatescore") HockeyScoreboard h) {
	hsservice.save(h);
    return "redirect:/hockey/getscore";
}
@GetMapping("/deletescore")
public String deleteTeam(@RequestParam("hscoreboardid") int id) {
	hsservice.deleteById(id);
	return "redirect:/hockey/getscore";
}
}
