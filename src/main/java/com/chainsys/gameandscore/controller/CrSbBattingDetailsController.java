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
import com.chainsys.gameandscore.service.Batting2Service;
import com.chainsys.gameandscore.service.CrSbBattingDetailsService;

@Controller
@RequestMapping("/batting")
public class CrSbBattingDetailsController {
	@Autowired
	private CrSbBattingDetailsService bdservice;
	@Autowired
	private Batting2Service bd2service;

	@GetMapping("/getalldetails")
	public String getalldetails(Model model) {
		List <CrSbBattingDetails> detailslist=bdservice.getCrSbBattingDetails();
		model.addAttribute("battingdetails", detailslist);
		return "battingdetails-list";
	}
	
	@GetMapping("/addbatting")
	public String battingAddForm(Model model) {
		CrSbBattingDetails b=new CrSbBattingDetails();
		model.addAttribute("addbattingdetails", b);
		return "add-battingdetails-form";
	}
	@PostMapping("/add")
	public String addNewDetails(@ModelAttribute("addbattingdetails")CrSbBattingDetails batdetails) {
		bdservice.save(batdetails);
		return "redirect:/batting/getalldetails";
	}
	@GetMapping("/updatebatting")
	public String showUpdateForm(@RequestParam("crbattingid") int id, Model model) {
	    CrSbBattingDetails b = bdservice.findById(id);
	    model.addAttribute("updatedetails", b);
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

	
	
	@GetMapping("/get2details")
	public String getGame2Details(Model model) {
		List <CrSbBattingDetails> details2list=bd2service.getCrSbBattingDetails();
		model.addAttribute("batting2details", details2list);
		return "batting2-list";
	}
	
	@GetMapping("/add2batting")
	public String batting2AddForm(Model model) {
		CrSbBattingDetails b=new CrSbBattingDetails();
		model.addAttribute("addbatting2details", b);
		return "add-batting2";
	}
	@PostMapping("/add2")
	public String addNew2Details(@ModelAttribute("addbatting2details")CrSbBattingDetails bd2) {
		bd2service.save(bd2);
		return "batting2-list";
	}
	@GetMapping("/update2batting")
	public String showUpdate2Form(@RequestParam("crbattingid") int id, Model model) {
	    CrSbBattingDetails b = bd2service.findById(id);
	    model.addAttribute("update2details", b);
	    return "update-batting2";
	}

	@PostMapping("/update2")
	public String updateBatting2Details(@ModelAttribute("update2details") CrSbBattingDetails b) {
		bd2service.save(b);
	    return "redirect:/batting/get2Details";
	}
	@GetMapping("/delete2batting")
	public String deleteBatting2Details(@RequestParam("crbattingid") int id) {
		bd2service.deleteById(id);
		return "redirect:/batting/get2Details";
	}
	
	
	@GetMapping("/get3details")
	public String getGame3Details(Model model) {
		List <CrSbBattingDetails> detailslist=bdservice.getCrSbBattingDetails();
		model.addAttribute("batting3details", detailslist);
		return "batting3-list";
	}
	
	@GetMapping("/add3batting")
	public String batting3AddForm(Model model) {
		CrSbBattingDetails b=new CrSbBattingDetails();
		model.addAttribute("addbatting3details", b);
		return "add-batting3";
	}
	@PostMapping("/add3")
	public String addNew3Details(@ModelAttribute("addbatting3details")CrSbBattingDetails bd) {
		bdservice.save(bd);
		return "redirect:/batting/get3Details";
	}
	@GetMapping("/update3batting")
	public String showUpdate3Form(@RequestParam("crbattingid") int id, Model model) {
	    CrSbBattingDetails t = bdservice.findById(id);
	    model.addAttribute("update3details", t);
	    return "update-batting3";
	}

	@PostMapping("/update3")
	public String updateBatting3Details(@ModelAttribute("update3details") CrSbBattingDetails b) {
		bdservice.save(b);
	    return "redirect:/batting/get3Details";
	}
	@GetMapping("/delete3batting")
	public String deleteBatting3Details(@RequestParam("crbattingid") int id) {
		bdservice.deleteById(id);
		return "redirect:/batting/get3Details";
	}

}
