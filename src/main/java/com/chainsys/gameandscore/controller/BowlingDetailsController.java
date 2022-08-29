package com.chainsys.gameandscore.controller;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.chainsys.gameandscore.businesslogic.Logic;
import com.chainsys.gameandscore.model.BowlingDetails;
import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Player;
import com.chainsys.gameandscore.service.BowlingDetailsService;
import com.chainsys.gameandscore.service.GameService;
import com.chainsys.gameandscore.service.PlayerService;
@Controller
@RequestMapping("/bowling")
public class BowlingDetailsController {
	public static final String LISTOFBOWLING = "redirect:/bowling/getalldetails";

	@Autowired
	private BowlingDetailsService bowlingService;
	@Autowired
	private PlayerService playerService;
	@Autowired
	private GameService gameService;
	
	@GetMapping("/getalldetails")
	public String getBowlingDetails(@RequestParam("id")int gameId,Model model) {
		List<BowlingDetails> bowl = bowlingService.getBowlingDetails();
		Game game=gameService.findById(gameId);
		List <BowlingDetails> teamAList =bowl.stream().filter(bat-> bat.getTeam().equals(game.getTeamA())).collect(Collectors.toList());
		List <BowlingDetails> teamBList =bowl.stream().filter(bat-> bat.getTeam().equals(game.getTeamB())).collect(Collectors.toList());
		model.addAttribute("teamAList", teamAList);
		model.addAttribute("teamBList", teamBList);
		return "bowlingdetails-list";
	}
@GetMapping("/addbowling")
public String bowlingAddForm(@RequestParam("id")int gameId,@RequestParam("playerId")int playerId,Model model) {
	BowlingDetails b=new BowlingDetails();
	Player player=playerService.findById(playerId);
	b.setGameid(gameId);
	b.setPlayerName(player.getName());
	b.setTeam(player.getTeam());
	model.addAttribute("adddetails", b);
	return "add-bowlingdetails-form";
}
@PostMapping("/add")
public String addNewBowling(@ModelAttribute("adddetails")BowlingDetails bl) {
	
	System.out.println(Logic.getEconomy(bl.getRuns(), bl.getOvers()));
	bl.setEconomy(Logic.getEconomy(bl.getRuns(), bl.getOvers()));
	bowlingService.save(bl);
	int gameId=bl.getGameid();
	return "redirect:/player/getallplayersbyteam?id="+gameId;
}
@GetMapping("/updatebowling")
public String showUpdateForm(@RequestParam("crbowlingid") int id, Model model) {
	BowlingDetails b = bowlingService.findById(id);
    model.addAttribute("updatebowling", b);
    return "update-bowlingdetails-form";
}

@PostMapping("/update")
public String updateBowling(@ModelAttribute("updatebowling") BowlingDetails b) {
	bowlingService.save(b);
    return LISTOFBOWLING;
}
@GetMapping("/deletedetails")
public String deleteBowlingDetails(@RequestParam("crbowlingid") int id) {
	bowlingService.deleteById(id);
	return LISTOFBOWLING;
}

}
