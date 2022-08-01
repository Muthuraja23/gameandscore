package com.chainsys.gameandscore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.gameandscore.model.Team;
import com.chainsys.gameandscore.service.TeamService;

@Controller
@RequestMapping("/team")
public class TeamController {
	@Autowired
	private TeamService tmservice;

	@GetMapping("/getallteam")
	public String getallteam(Model model) {
		List<Team> teamlist = tmservice.getTeams();
		model.addAttribute("allteams", teamlist);
		return "team-list";
	}
}
