package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.HSbGoals;
import com.chainsys.gameandscore.repository.HSbGoalsRepository;

@Service
public class HSbGoalsService {
	@Autowired
	private HSbGoalsRepository rp;
	public List<HSbGoals> getHgoals(){
	List <HSbGoals> goallist = rp.findAll();
	return goallist;
	}
	public HSbGoals save(HSbGoals hky) {
		return rp.save(hky);
	}
	public HSbGoals findById(int id) {
		return rp.findById(id);
		}
@Transactional
public void deleteById(int id) {
	rp.deleteById(id);
}
}
