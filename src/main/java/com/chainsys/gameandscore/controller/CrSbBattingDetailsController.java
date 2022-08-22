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

import com.chainsys.gameandscore.model.CrSbBattingDetails;
import com.chainsys.gameandscore.service.CrSbBattingDetailsService;

@Controller
@RequestMapping("/batting")
public class CrSbBattingDetailsController {
	public static final String LISTOFBATTING = "redirect:/batting/getalldetails";
	@Autowired
	private CrSbBattingDetailsService batservice;

	@GetMapping("/getalldetails")
	public String getalldetails(Model model) {
		List <CrSbBattingDetails> detailslist = batservice.getCrSbBattingDetails();
		model.addAttribute("battingdetails", detailslist);
		return "battingdetails-list";
	}
	
	@GetMapping("/addbatting")
	public String addBattingForm(Model model) {
		CrSbBattingDetails batting = new CrSbBattingDetails();
		model.addAttribute("addbattingdetails", batting);
		return "add-battingdetails-form";
	}
	@PostMapping("/add")
	public String addNewBatting(@Valid @ModelAttribute("addbattingdetails")CrSbBattingDetails battingDetails,Errors errors ) {
	    if (errors.hasErrors()) {
            return "add";
	    }
		batservice.save(battingDetails);
		return LISTOFBATTING;
	}
	@GetMapping("/updatebatting")
	public String showUpdateForm(@RequestParam("crbattingid") int id, Model model) {
	    CrSbBattingDetails b = batservice.findById(id);
	    model.addAttribute("updatedetails", b);
	    return "update-battingdetails-form";
	}

	@PostMapping("/update")
	public String battingUpdate(@ModelAttribute("updatedetails") CrSbBattingDetails battingDetails) {
		batservice.save(battingDetails);
	    return LISTOFBATTING;
	}
	@GetMapping("/deletebatting")
	public String deleteBattingDetails(@RequestParam("crbattingid") int id) {
		batservice.deleteById(id);
		return LISTOFBATTING;
	}

}
