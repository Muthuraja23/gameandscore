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

import com.chainsys.gameandscore.model.FbSbGoals;
import com.chainsys.gameandscore.service.FbSbGoalsService;

@Controller
@RequestMapping("/fbgoals")
public class FbSbGoalsController {
	@Autowired
	private FbSbGoalsService fsgservice;

	@GetMapping("/getfbgoals")
	public String getFbgoals(Model model) {
		List<FbSbGoals> fsgoals = fsgservice.getFbgoals();
		model.addAttribute("allgoals", fsgoals);
		return "fbsbgoals-list";
	}
@GetMapping("/addform")
public String fbsbgoalsAddForm(Model model) {
	FbSbGoals f=new FbSbGoals();
	model.addAttribute("addgoal", f);
	return "add-fbsbgoals-form";
}
@PostMapping("/add")
public String addNewTeam(@ModelAttribute("addgoal")FbSbGoals fb) {
	fsgservice.save(fb);
	return "redirect:/fbgoals/getfbgoals";
}
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("fbgoalsid") int id, Model model) {
	FbSbGoals f = fsgservice.findById(id);
    model.addAttribute("updategoal", f);
    return "update-fbsbgoals-form";
}

@PostMapping("/update")
public String updateteam(@ModelAttribute("updategoal") FbSbGoals f) {
	fsgservice.save(f);
    return "redirect:/fbgoals/getfbgoals";
}
@GetMapping("/deletegoal")
public String deleteTeam(@RequestParam("fbgoalsid") int id) {
	fsgservice.deleteById(id);
	return "redirect:/fbgoals/getfbgoals";
}

}
