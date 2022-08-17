package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.FbSbGoals;
import com.chainsys.gameandscore.repository.FbSbGoalsRepository;

@Service
public class FbSbGoalsService {
	@Autowired
	private FbSbGoalsRepository rp;

	public List<FbSbGoals> getFbgoals() {
		List<FbSbGoals> goallist = rp.findAll();
		return goallist;
	}

	public FbSbGoals save(FbSbGoals fb) {
		return rp.save(fb);
	}

	public FbSbGoals findById(int id) {
		return rp.findById(id);
	}
	public List<FbSbGoals> getGoalsByGameId(int id){
		return rp.findByGameid(id);
	}
	
	public void deleteById(int id) {
		rp.deleteById(id);
	}
}
