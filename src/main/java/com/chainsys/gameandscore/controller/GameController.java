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

import com.chainsys.gameandscore.dto.GameFootBallDTO;
import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	public static final String LISTOFGAMES = "redirect:/game/getallgames";
	@Autowired
	private GameService gmservice;

	@GetMapping("/index")
	public String index() {

		return "index";
	}

	@GetMapping("/getallgames")
	public String getallgames(@RequestParam("id") int sportsId, Model model) {
		List<Game> gamelist = gmservice.getGame(sportsId);
		model.addAttribute("allgames", gamelist);
		return "game-list";
	}

	@GetMapping("/directioncontroll")
	public String directionScoreBoard(@RequestParam("id") int gameId, Model model) {
		Game game = gmservice.findById(gameId);
		if (game.getSportsid() == 1) {
			return "redirect:/cricket/getscore?id=" + gameId;
		} else if (game.getSportsid() == 2) {
			return "redirect:/football/getscore?id=" + gameId;
		} else if (game.getSportsid() == 3) {
			return "redirect:/hockey/getscore?id=" + gameId;
		} else {
			return "redirect:/game/getallgames?id=" + gameId;
		}
	}

	@GetMapping("addform")
	public String gameAddForm(Model model) {
		Game g = new Game();
		model.addAttribute("addgame", g);
		return "add-game-form";
	}

	@PostMapping("/add")
	public String addnewsports(@ModelAttribute("addgame") Game gm) {
		gmservice.save(gm);
		int id = gm.getSportsid();
		return "redirect:/game/getallgames?id=" + id;
	}

	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("gameid") int id, Model model) {
		Game g = gmservice.findById(id);
		model.addAttribute("updategame", g);
		return "update-game-form";
	}

	@PostMapping("/updategame")
	public String updateGame(@ModelAttribute("updategame") Game g) {
		gmservice.save(g);
		return LISTOFGAMES;
	}

	@GetMapping("/deletegame")
	public String deleteGame(@RequestParam("gameid") int id) {
		gmservice.deleteById(id);
		return LISTOFGAMES;
	}

	@GetMapping("/getfootballscoreboard")
	public String getGamScoreBoard(@RequestParam("id") int id, Model model) {
		GameFootBallDTO dto = gmservice.getGameFootBall(id);
		model.addAttribute("getGame", dto.getGame());
		model.addAttribute("getScoreboardlist", dto.getFootballScoreboards());
		return "game-scoreboard-list";
	}
}
