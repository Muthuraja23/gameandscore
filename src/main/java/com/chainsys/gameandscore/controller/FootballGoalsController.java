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

import com.chainsys.gameandscore.model.FootballGoals;
import com.chainsys.gameandscore.service.FootballGoalsService;

@Controller
@RequestMapping("/fbgoals")
public class FootballGoalsController {
	public static final String LISTOFFBGOALS = "redirect:/fbgoals/getfbgoals";
	@Autowired
	private FootballGoalsService footballGoalService;

	@GetMapping("/getfbgoals")
	public String getFbgoals(Model model) {
		List<FootballGoals> footballgoals = footballGoalService.getFbgoals();
		model.addAttribute("allgoals", footballgoals);
		return "fbsbgoals-list";
	}

	@GetMapping("/addform")
	public String fbsbgoalsAddForm(Model model) {
		FootballGoals f = new FootballGoals();
		model.addAttribute("addgoal", f);
		return "add-fbsbgoals-form";
	}

	@PostMapping("/add")
	public String addNewGoal(@ModelAttribute("addgoal") FootballGoals fb) {
		footballGoalService.save(fb);
		return LISTOFFBGOALS;
	}

	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("fbgoalsid") int id, Model model) {
		FootballGoals f = footballGoalService.findById(id);
		model.addAttribute("updategoal", f);
		return "update-fbsbgoals-form";
	}

	@PostMapping("/update")
	public String updateGoal(@ModelAttribute("updategoal") FootballGoals f) {
		footballGoalService.save(f);
		return LISTOFFBGOALS;
	}

	@GetMapping("/deletegoal")
	public String deleteGoalStat(@RequestParam("fbgoalsid") int id) {
		footballGoalService .deleteById(id);
		return LISTOFFBGOALS;
	}

}
