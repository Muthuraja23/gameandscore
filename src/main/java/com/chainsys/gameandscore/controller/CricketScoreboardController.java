package com.chainsys.gameandscore.controller;


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

import com.chainsys.gameandscore.model.CricketScoreboard;
import com.chainsys.gameandscore.service.CricketScoreboardService;

@Controller
@RequestMapping("/cricket")
public class CricketScoreboardController {
	public static final String LISTOFDETAILS= "redirect:/cricket/getscore";

	@Autowired
	private CricketScoreboardService cricketScoreboardService;
	
	@GetMapping("/getscore")
	public String getscore(@RequestParam("id") int gameId, Model model) {
		//System.out.println(gameId);
		CricketScoreboard crScoreboard=cricketScoreboardService.getScoreByCalculation(gameId);
		//System.out.println(crScoreboard.getGameid());
		cricketScoreboardService.save(crScoreboard);
		model.addAttribute("crScoreboard", crScoreboard);
		return "crscoreboard-list";
	}

	@GetMapping("/addscore")
	public String scoreAddForm(Model model) {
		CricketScoreboard cs = new CricketScoreboard();
		model.addAttribute("addscore", cs);
		return "add-crscoreboard-form";
	}

	@PostMapping("/add")
	public String addScore(@Valid @ModelAttribute("addscore") CricketScoreboard c,Errors errors) {
		if (errors.hasErrors()) {
            return "add";
	    }
		cricketScoreboardService.save(c);
		return LISTOFDETAILS;
	}

	@GetMapping("/updatescore")
	public String showUpdateForm(@RequestParam("crscoreboardid") int id, Model model) {
		CricketScoreboard cs = cricketScoreboardService.findById(id);
		model.addAttribute("updatescore", cs);
		return "update-crscoreboard-form";
	}

	@PostMapping("/updatescore")
	public String updateteam(@ModelAttribute("updatescore") CricketScoreboard cs) {
		cricketScoreboardService.save(cs);
		return LISTOFDETAILS;
	}

	@GetMapping("/deletescore")
	public String deleteTeam(@RequestParam("crscoreboardid") int id) {
		cricketScoreboardService.deleteById(id);
		return LISTOFDETAILS;
	}
}
