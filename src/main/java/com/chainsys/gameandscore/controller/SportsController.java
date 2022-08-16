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

import com.chainsys.gameandscore.model.Sports;
import com.chainsys.gameandscore.service.SportsService;

@Controller
@RequestMapping("/sports")
public class SportsController {
	@Autowired
	SportsService spservice;
	@GetMapping("/getallsports")
	public String getallsports(Model model) {
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
   public String addnewsports(@ModelAttribute("addsports") Sports sp) {
   	spservice.save(sp);
       return "redirect:/sports/getallsports";
   }
	@GetMapping("/updateform")
    public String showUpdateForm(@RequestParam("sportsid") int id, Model model) {
        Sports s = spservice.findById(id);
        model.addAttribute("updatesports", s);
        return "update-sports-form";
    }
    @PostMapping("/updatesports")
    public String updatesports(@ModelAttribute("updatesports") Sports s) {
    	spservice.save(s);
        return "redirect:/sports/getallsports";
    }
    @GetMapping("/deletesports")
    public String deletesports(@RequestParam("sportsid") int id) {
    	spservice.deleteById(id);
        return "redirect:/sports/getallsports";
    }
}
