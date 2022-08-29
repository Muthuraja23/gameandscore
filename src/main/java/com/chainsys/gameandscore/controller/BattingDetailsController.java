package com.chainsys.gameandscore.controller;

import java.util.List;
import java.util.stream.Collectors;

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

import com.chainsys.gameandscore.businesslogic.Logic;
import com.chainsys.gameandscore.model.BattingDetails;
import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Player;
import com.chainsys.gameandscore.service.BattingDetailsService;
import com.chainsys.gameandscore.service.GameService;
import com.chainsys.gameandscore.service.PlayerService;

@Controller
@RequestMapping("/batting")
public class BattingDetailsController {
	public static final String LISTOFBATTING = "redirect:/batting/getalldetails";
	@Autowired
	private BattingDetailsService batservice;
	@Autowired
	private PlayerService playerService;
	@Autowired
	private GameService gameService;
	
	@GetMapping("/getalldetails")
	public String getalldetails(@RequestParam("id")int gameId,Model model) {
		List <BattingDetails> detailslist = batservice.getBattingByGameId(gameId);
		Game game=gameService.findById(gameId);
		List <BattingDetails> teamAList =detailslist.stream().filter(bat-> bat.getTeam().equals(game.getTeamA())).collect(Collectors.toList());
		List <BattingDetails> teamBList =detailslist.stream().filter(bat-> bat.getTeam().equals(game.getTeamB())).collect(Collectors.toList());
		model.addAttribute("teamAList", teamAList);
		model.addAttribute("teamBList", teamBList);
		return "battingdetails-list";
	}
	
	@GetMapping("/addbatting")
	public String addBattingForm(@RequestParam("id")int gameId,@RequestParam("playerId")int playerId,Model model) {
		Player player=playerService.findById(playerId);
		BattingDetails batting = new BattingDetails();
		batting.setPlayername(player.getName());
		batting.setGameid(gameId);
		batting.setTeam(player.getTeam());
		model.addAttribute("addbattingdetails", batting);
		return "add-battingdetails-form";
	}
	@PostMapping("/add")
	public String addNewBatting(@Valid @ModelAttribute("addbattingdetails")BattingDetails battingDetails,Errors errors ) {
	    if (errors.hasErrors()) {
            return "add";
	    }
	    battingDetails.setStrikerate(Logic.getStrickRate(battingDetails.getRunsscored(), battingDetails.getBallsfaced()));
		batservice.save(battingDetails);
		int gameId=battingDetails.getGameid();
		return "redirect:/player/getallplayersbyteam?id="+gameId;
	}
	@GetMapping("/updatebatting")
	public String showUpdateForm(@RequestParam("crbattingid") int id, Model model) {
	    BattingDetails b = batservice.findById(id);
	    model.addAttribute("updatedetails", b);
	    return "update-battingdetails-form";
	}

	@PostMapping("/update")
	public String battingUpdate(@ModelAttribute("updatedetails") BattingDetails battingDetails) {
		batservice.save(battingDetails);
	    return LISTOFBATTING;
	}
	@GetMapping("/deletebatting")
	public String deleteBattingDetails(@RequestParam("crbattingid") int id) {
		batservice.deleteById(id);
		return LISTOFBATTING;
	}

}
