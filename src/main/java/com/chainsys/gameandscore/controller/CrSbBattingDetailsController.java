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

import com.chainsys.gameandscore.model.CrSbBattingDetails;
import com.chainsys.gameandscore.service.CrSbBattingDetailsService;

@Controller
@RequestMapping("/batting")
public class CrSbBattingDetailsController {
	@Autowired
	private CrSbBattingDetailsService bdservice;

	@GetMapping("/getalldetails")
	public String getalldetails(Model model) {
		List <CrSbBattingDetails> detailslist=bdservice.getCrSbBattingDetails();
		model.addAttribute("alldetails", detailslist);
		return "battingdetails-list";
	}
	
	@GetMapping("/addbatting")
	public String teamAddForm(Model model) {
		CrSbBattingDetails b=new CrSbBattingDetails();
		model.addAttribute("addbattingdetails", b);
		return "add-battingdetails-form";
	}
	@PostMapping("/add")
	public String addNewDetails(@ModelAttribute("addbattingdetails")CrSbBattingDetails bd) {
		bdservice.save(bd);
		return "redirect:/batting/getalldetails";
	}
	@GetMapping("/updatebatting")
	public String showUpdateForm(@RequestParam("crbattingid") int id, Model model) {
	    CrSbBattingDetails t = bdservice.findById(id);
	    model.addAttribute("updatedetails", t);
	    return "update-battingdetails-form";
	}

	@PostMapping("/update")
	public String updateBattingDetails(@ModelAttribute("updatedetails") CrSbBattingDetails b) {
		bdservice.save(b);
	    return "redirect:/batting/getalldetails";
	}
	@GetMapping("/deletebatting")
	public String deleteBattingDetails(@RequestParam("crbattingid") int id) {
		bdservice.deleteById(id);
		return "redirect:/batting/getalldetails";
	}
}
