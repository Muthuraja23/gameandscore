package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Sports;
import com.chainsys.gameandscore.repository.GameRepository;
import com.chainsys.gameandscore.repository.SportsRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository repo;
	public List<Game> getGame() {
		List<Game> gamelist = repo.findAll();
		return gamelist;
	}
	public Game save(Game gm) {
		return repo.save(gm);
	}
	public Game findById(int id) {
		return repo.findById(id);
	}
	@Transactional
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}
