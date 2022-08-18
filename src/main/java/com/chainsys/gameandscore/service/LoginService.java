package com.chainsys.gameandscore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.gameandscore.model.Login;
import com.chainsys.gameandscore.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	public Login findIdAndPassword(String id,String password) {
		return loginRepository.findByAdminIdAndPassword(id, password);
	}
}
