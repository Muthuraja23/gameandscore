package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.gameandscore.model.FootballGoals;
import com.chainsys.gameandscore.repository.FootballGoalsRepository;

@Service
public class FootballGoalsService {
	@Autowired
	private FootballGoalsRepository rp;

	public List<FootballGoals> getFbgoals() {
		return rp.findAll();
	}

	public FootballGoals save(FootballGoals fb) {
		return rp.save(fb);
	}

	public FootballGoals findById(int id) {
		return rp.findById(id);
	}

	public List<FootballGoals> getGoalsByGameId(int id) {
		return rp.findByGameid(id);
	}

	public void deleteById(int id) {
		rp.deleteById(id);
	}
}
