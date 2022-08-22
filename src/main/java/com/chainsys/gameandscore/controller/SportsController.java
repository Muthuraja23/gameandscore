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

import com.chainsys.gameandscore.model.Sports;
import com.chainsys.gameandscore.service.SportsService;

@Controller
@RequestMapping("/sports")
public class SportsController {
	public static final String LISTOFSPORTS = "redirect:/sports/getallsports";
	@Autowired
	SportsService spservice;

	@GetMapping("/getallsports")
	public String getAllSports(Model model) {
		List<Sports> sportslist = spservice.getSports();
		model.addAttribute("allsports", sportslist);
		return "sports-list";
	}

	@GetMapping("addform")
	public String sportsAddForm(Model model) {
		Sports s = new Sports();
		model.addAttribute("addsports", s);
		return "add-sports-form";
	}

	@PostMapping("/add")
	public String addNewSports(@Valid @ModelAttribute("addsports") Sports sp,Errors errors) {
		if (errors.hasErrors()) {
            return "add";
	    }
		spservice.save(sp);
		return LISTOFSPORTS;
	}

	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("sportsid") int id, Model model) {
		Sports s = spservice.findById(id);
		model.addAttribute("updatesports", s);
		return "update-sports-form";
	}

	@PostMapping("/updatesports")
	public String updateSports(@ModelAttribute("updatesports") Sports s) {
		spservice.save(s);
		return LISTOFSPORTS;
	}

	@GetMapping("/deletesports")
	public String deleteSports(@RequestParam("sportsid") int id) {
		spservice.deleteById(id);
		return LISTOFSPORTS;
	}
}
