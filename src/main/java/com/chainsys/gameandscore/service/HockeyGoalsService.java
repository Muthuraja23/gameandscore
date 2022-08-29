package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.gameandscore.model.HockeyGoals;
import com.chainsys.gameandscore.repository.HockeyGoalsRepository;

@Service
public class HockeyGoalsService {
	@Autowired
	private HockeyGoalsRepository rp;

	public List<HockeyGoals> getHgoals() {
		return rp.findAll();
	}

	public HockeyGoals save(HockeyGoals hky) {
		return rp.save(hky);
	}

	public HockeyGoals findById(int id) {
		return rp.findById(id);
	}
	public List<HockeyGoals> getGoalsByGameId(int id){
		return rp.findByGameid(id);
	}

	public void deleteById(int id) {
		rp.deleteById(id);
	}
}
