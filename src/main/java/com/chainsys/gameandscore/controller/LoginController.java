package com.chainsys.gameandscore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.gameandscore.commonutil.InvalidInputDataException;
import com.chainsys.gameandscore.model.Login;
import com.chainsys.gameandscore.service.LoginService;

@Controller
@RequestMapping("/admin")
public class LoginController {
	private static final String LOGIN = "login";
	@Autowired
	private LoginService loginService;
	@GetMapping("/login")
	public String loginCheck(Model model) {
		Login login =new Login();
		model.addAttribute("log", login);
		return LOGIN;
	}
	@PostMapping("/loginValidation")
	public String loginValidation(@ModelAttribute("log")Login login,Model model) {
		login=loginService.findIdAndPassword(login.getAdminId(), login.getPassword());
		try {
		if(login==null) {
			throw new InvalidInputDataException("No matching data found");
		}
		}catch(Exception exp) {
			model.addAttribute("message","Admin Id or Password is incorrect");
			return LOGIN;
		}
		return "admin";
	}
}
