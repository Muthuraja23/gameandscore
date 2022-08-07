package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.CrScoreboard;
import com.chainsys.gameandscore.repository.CrScoreboardRepository;

@Service
public class CrScoreboardService {

	@Autowired
	private CrScoreboardRepository rp;
	public List<CrScoreboard> getScore(){
	List <CrScoreboard> scoreboard = rp.findAll();
	return scoreboard;
	}
	public CrScoreboard save(CrScoreboard cs) {
		return rp.save(cs);
	}
	public CrScoreboard findById(int id) {
		return rp.findById(id);
		}
@Transactional
public void deleteById(int id) {
	rp.deleteById(id);
}
	
}
