package com.chainsys.gameandscore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.chainsys.gameandscore.model.Login;
import com.chainsys.gameandscore.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@GetMapping("/login")
	public String LoginCheack(Model model) {
		Login login =new Login();
		model.addAttribute("login", login);
		return "login";
	}
	@PostMapping("/loginValidation")
	public String LoginValidation(@ModelAttribute("login")Login login,Model model) {
		try {
		login=loginService.findIdAndPassword(login.getAdminId(), login.getPassword());
		if(login!=null) {
			return "admin";
		}
		}catch(Exception exp) {
			return "error-page";
		}
		return "error-page";
	}
}
