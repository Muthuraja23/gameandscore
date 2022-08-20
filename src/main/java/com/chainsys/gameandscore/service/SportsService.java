package com.chainsys.gameandscore.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.gameandscore.model.Sports;
import com.chainsys.gameandscore.repository.GameRepository;
import com.chainsys.gameandscore.repository.SportsRepository;

@Service
public class SportsService {
	@Autowired
	private SportsRepository sportsRepo;
	@Autowired
	private GameRepository gameRepo;
	public List<Sports> getSports() {
		List<Sports> sportslist = sportsRepo.findAll();
		return sportslist;
	}

	public Sports save(Sports sp) {
		return sportsRepo.save(sp);
	}

	public Sports findById(int id) {
		return sportsRepo.findById(id);
	}
	public void deleteById(int id) {
		sportsRepo.deleteById(id);
	}
	
}
