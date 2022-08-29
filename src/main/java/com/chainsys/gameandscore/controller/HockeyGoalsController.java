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

import com.chainsys.gameandscore.model.HockeyGoals;
import com.chainsys.gameandscore.service.HockeyGoalsService;

@Controller
@RequestMapping("/hgoals")
public class HockeyGoalsController {
	public static final String LISTOFHGOALS= "redirect:/hgoals/gethgoals";
	@Autowired
	private HockeyGoalsService hsgservice;
	@GetMapping("/gethgoals")
	public String getFbgoals(Model model) {
		List<HockeyGoals> hsgoals = hsgservice.getHgoals();
		model.addAttribute("allgoals", hsgoals);
		return "hsbgoals-list";
	}
@GetMapping("/addform")
public String hsbgoalsAddForm(Model model) {
	HockeyGoals h=new HockeyGoals();
	model.addAttribute("addgoal", h);
	return "add-hsbgoals-form";
}
@PostMapping("/add")
public String addNewHockeyGoal(@Valid @ModelAttribute("addgoal")HockeyGoals hky,Errors errors) {
	if (errors.hasErrors()) {
		return "add";
	}
	hsgservice.save(hky);
	return LISTOFHGOALS;
}
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("hgoalsid") int id, Model model) {
	HockeyGoals h = hsgservice.findById(id);
    model.addAttribute("updategoal", h);
    return "update-hsbgoals-form";
}

@PostMapping("/update")
public String updateHockeyGoal(@ModelAttribute("updategoal") HockeyGoals h) {
	hsgservice.save(h);
    return LISTOFHGOALS;
}
@GetMapping("/deletegoal")
public String deleteHockeyGoal(@RequestParam("hgoalsid") int id) {
	hsgservice.deleteById(id);
	return LISTOFHGOALS;
}

}
