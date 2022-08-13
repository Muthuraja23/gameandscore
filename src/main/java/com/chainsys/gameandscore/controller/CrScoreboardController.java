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

import com.chainsys.gameandscore.model.CrScoreboard;
import com.chainsys.gameandscore.service.CrScoreboardService;

@Controller
@RequestMapping("/cricket")
public class CrScoreboardController {
@Autowired
private CrScoreboardService csservice;
@GetMapping("/getscore")
public String getscore(Model model) {
	List<CrScoreboard> sboard = csservice.getScore();
	model.addAttribute("score", sboard);
	return "crscoreboard-list";
}
@GetMapping("/addscore")
public String scoreAddForm(Model model) {
	CrScoreboard cs=new CrScoreboard();
	model.addAttribute("addscore", cs);
	return "add-crscoreboard-form";
}
@PostMapping("/add")
public String addScore(@ModelAttribute("addscore")CrScoreboard c) {
	csservice.save(c);
	return "redirect:/cricket/getscore";
}
@GetMapping("/updatescore")
public String showUpdateForm(@RequestParam("crscoreboardid") int id, Model model) {
	CrScoreboard cs = csservice.findById(id);
    model.addAttribute("updatescore", cs);
    return "update-crscoreboard-form";
}

@PostMapping("/updatescore")
public String updateteam(@ModelAttribute("updatescore") CrScoreboard cs) {
	csservice.save(cs);
    return "redirect:/cricket/getscore";
}
@GetMapping("/deletescore")
public String deleteTeam(@RequestParam("crscoreboardid") int id) {
	csservice.deleteById(id);
	return "redirect:/cricket/getscore";
}
/*
 * @GetMapping("/score") public String
 * scoreDetails(@RequestParam("crscoreboardid") int id,Model model) {
 * CrScoreboard crscore=csservice.findById(id);
 * model.addAttribute("score",crscore); return "crscoreboard-list"; }
 */
}
