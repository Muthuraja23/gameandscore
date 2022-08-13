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

import com.chainsys.gameandscore.model.Team;
import com.chainsys.gameandscore.service.TeamService;

@Controller
@RequestMapping("/team")
public class TeamController {
	@Autowired
	private TeamService tmservice;

	@GetMapping("/getallteams")
	public String getallteam(Model model) {
		List<Team> teamlist = tmservice.getTeams();
		model.addAttribute("allteams", teamlist);
		return "team-list";
	}
@GetMapping("/addform")
public String teamAddForm(Model model) {
	Team t=new Team();
	model.addAttribute("addteam", t);
	return "add-team-form";
}
@PostMapping("/add")
public String addNewTeam(@ModelAttribute("addteam")Team tm) {
	tmservice.save(tm);
	return "redirect:/team/getallteams";
}
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("teamid") int id, Model model) {
    Team t = tmservice.findById(id);
    model.addAttribute("updateteam", t);
    return "update-team-form";
}

@PostMapping("/updateteam")
public String updateteam(@ModelAttribute("updateteam") Team t) {
	tmservice.save(t);
    return "redirect:/team/getallteams";
}
@GetMapping("/deleteteam")
public String deleteTeam(@RequestParam("teamid") int id) {
	tmservice.deleteById(id);
	return "redirect:/team/getallteams";
}
}
