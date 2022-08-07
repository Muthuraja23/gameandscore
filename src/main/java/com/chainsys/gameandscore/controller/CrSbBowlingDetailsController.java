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

import com.chainsys.gameandscore.model.CrSbBowlingDetails;
import com.chainsys.gameandscore.service.CrSbBowlingDetailsService;

@Controller
@RequestMapping("/bowling")
public class CrSbBowlingDetailsController {
	@Autowired
	private CrSbBowlingDetailsService blservice;

	@GetMapping("/getalldetails")
	public String getBowlingDetails(Model model) {
		List<CrSbBowlingDetails> bowl = blservice.getBowlingDetails();
		model.addAttribute("alldetails", bowl);
		return "bowlingdetails-list";
	}
@GetMapping("/addform")
public String teamAddForm(Model model) {
	CrSbBowlingDetails b=new CrSbBowlingDetails();
	model.addAttribute("adddetails", b);
	return "add-bowlingdetails-form";
}
@PostMapping("/add")
public String addNewTeam(@ModelAttribute("adddetails")CrSbBowlingDetails bl) {
	blservice.save(bl);
	return "redirect:/bowling/getalldetails";
}
@GetMapping("/updatebowling")
public String showUpdateForm(@RequestParam("crbowlingid") int id, Model model) {
	CrSbBowlingDetails b = blservice.findById(id);
    model.addAttribute("updatebowling", b);
    return "update-bowlingdetails-form";
}

@PostMapping("/update")
public String updateteam(@ModelAttribute("updatebowling") CrSbBowlingDetails b) {
	blservice.save(b);
    return "redirect:/bowling/getalldetails";
}
@GetMapping("/deletedetails")
public String deleteTeam(@RequestParam("crbowlingid") int id) {
	blservice.deleteById(id);
	return "redirect:/bowling/getalldetails";
}

}
