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

import com.chainsys.gameandscore.model.HSbGoals;
import com.chainsys.gameandscore.service.HSbGoalsService;

@Controller
@RequestMapping("/hgoals")
public class HSbGoalsController {
	@Autowired
	private HSbGoalsService hsgservice;
	@GetMapping("/gethgoals")
	public String getFbgoals(Model model) {
		List<HSbGoals> hsgoals = hsgservice.getHgoals();
		model.addAttribute("allgoals", hsgoals);
		return "hsbgoals-list";
	}
@GetMapping("/addform")
public String hsbgoalsAddForm(Model model) {
	HSbGoals h=new HSbGoals();
	model.addAttribute("addgoal", h);
	return "add-hsbgoals-form";
}
@PostMapping("/add")
public String addNewTeam(@ModelAttribute("addgoal")HSbGoals hky) {
	hsgservice.save(hky);
	return "redirect:/hgoals/gethgoals";
}
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("hgoalsid") int id, Model model) {
	HSbGoals h = hsgservice.findById(id);
    model.addAttribute("updategoal", h);
    return "update-hsbgoals-form";
}

@PostMapping("/update")
public String updateteam(@ModelAttribute("updategoal") HSbGoals h) {
	hsgservice.save(h);
    return "redirect:/hgoals/gethgoals";
}
@GetMapping("/deletegoal")
public String deleteTeam(@RequestParam("hgoalsid") int id) {
	hsgservice.deleteById(id);
	return "redirect:/hgoals/gethgoals";
}

}
