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

import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Sports;
import com.chainsys.gameandscore.service.GameService;
import com.chainsys.gameandscore.service.SportsService;

@Controller
@RequestMapping("/game")
public class GameController {
	@Autowired
	public GameService gmservice;
	@GetMapping("/getallgame")
	public String getallgames(Model model) {
		List<Game> gamelist = gmservice.getGame();
		model.addAttribute("allgames", gamelist);
		return "game-list";
	}
	@GetMapping("addform")
    public String gameAddForm(Model model) {
         Game g = new Game();
        model.addAttribute("addgame", g);
        return "add-game-form";
    }
	@PostMapping("/add")
   public String addnewsports(@ModelAttribute("addsports") Game gm) {
   	gmservice.save(gm);
       return "redirect:/game/getallgame";
   }
	@GetMapping("/updateform")
    public String showUpdateForm(@RequestParam("sportsid") int id, Model model) {
        Game g = gmservice.findById(id);
        model.addAttribute("updatesports", g);
        return "update-game-form";
    }

    @PostMapping("/updategame")
    public String updateGame(@ModelAttribute("updategame") Game g) {
    	gmservice.save(g);
        return "redirect:/game/getallgame";
    }
    @GetMapping("/deletegame")
    public String deletesgame(@RequestParam("gameid") int id) {
    	gmservice.deleteById(id);
        return "redirect:/game/getallgame";
    }
}
