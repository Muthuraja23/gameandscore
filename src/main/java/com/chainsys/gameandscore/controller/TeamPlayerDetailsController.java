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

import com.chainsys.gameandscore.model.TeamPlayerDetails;
import com.chainsys.gameandscore.service.TeamPlayerDetailsService;

@Controller
@RequestMapping("/teamplayerdetails")
public class TeamPlayerDetailsController {

	@Autowired
	private TeamPlayerDetailsService tpcservice;

	@GetMapping("/getallteamplayerdetails")
	public String getallteamplayerdetails(Model model) {
		List<TeamPlayerDetails> detaillist = tpcservice.getTeamPlayerDetails();
		model.addAttribute("allteamplayerdetails", detaillist);
		return "Teamplayerdetails-list";
	}
@GetMapping("/addform")
public String teamplayerdetailsAddForm(Model model) {
	TeamPlayerDetails t =new TeamPlayerDetails();
	model.addAttribute("addteamplayerdetails", t);
	return "add-teamplayerdetails-form";
}
@PostMapping("/add")
public String addNewTeam(@ModelAttribute("addteamplayerdetails")TeamPlayerDetails tp) {
	tpcservice.save(tp);
	return "redirect:/teamplayerdetails/getallteamplayerdetails";
}
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("teamplayerid") int id, Model model) {
    TeamPlayerDetails t = tpcservice.findById(id);
    model.addAttribute("updateteamplayerdetails", t);
    return "update-teamplayerdetails-form";
}

@PostMapping("/updateteamplayerdetails")
public String updateteamplayerdetails(@ModelAttribute("updateteamplayerdetails") TeamPlayerDetails t) {
	tpcservice.save(t);
    return "redirect:/teamplayerdetails/getallteamplayerdetails";
}
@GetMapping("/deleteteamplayerdetails")
public String deleteTeamPlayerDetails(@RequestParam("teamplayerid") int id) {
	tpcservice.deleteById(id);
	return "redirect:/teamplayerdetails/getallteamplayerdetails";
}

}