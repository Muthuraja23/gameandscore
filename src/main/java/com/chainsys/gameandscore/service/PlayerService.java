package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.Player;
import com.chainsys.gameandscore.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	private PlayerRepository pr;

	public List<Player> getplayers() {
		return pr.findAll();
	}

	public Player save(Player p) {
		return pr.save(p);
	}

	public Player findById(int id) {
		return pr.findById(id);
	}

	@Transactional
	public void deleteById(int id) {
		pr.deleteById(id);
	}
}
