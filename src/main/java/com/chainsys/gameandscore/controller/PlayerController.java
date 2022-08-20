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

import com.chainsys.gameandscore.model.Player;
import com.chainsys.gameandscore.service.PlayerService;

@Controller
@RequestMapping("/player")
public class PlayerController {
	public static final String LISTOFPLAYER = "redirect:/player/getallplayers";
	@Autowired
	private PlayerService plservice;

	@GetMapping("/getallplayers")
	public String getallplayers(Model model) {
		List<Player> playerlist = plservice.getplayers();
		model.addAttribute("allplayers", playerlist);
		return "player-list";
	}

	@GetMapping("/addform")
	public String playerAddForm(Model model) {
		Player p = new Player();
		model.addAttribute("addplayer", p);
		return "add-player-form";
	}

	@PostMapping("/add")
	public String addNewPlayer(@ModelAttribute("addplayer") Player pl) {
		plservice.save(pl);
		return LISTOFPLAYER;
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("playerid") int id, Model model) {
	    Player p = plservice.findById(id);
	    model.addAttribute("updateplayer", p);
	    return "update-player-form";
	}

	@PostMapping("/updateplayer")
	public String updatePlayer(@ModelAttribute("updateplayer") Player p) {
		plservice.save(p);
	    return LISTOFPLAYER;
	}
	@GetMapping("/deleteplayer")
	public String deletePlayer(@RequestParam("playerid") int id) {
		plservice.deleteById(id);
		return LISTOFPLAYER;
	}
	
}
