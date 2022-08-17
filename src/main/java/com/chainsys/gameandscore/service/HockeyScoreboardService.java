package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.FootballScoreboard;
import com.chainsys.gameandscore.model.HockeyScoreboard;
import com.chainsys.gameandscore.repository.FootballScoreboardRepository;
import com.chainsys.gameandscore.repository.HockeyScoreboardRepository;


@Service
public class HockeyScoreboardService {

	@Autowired
	private HockeyScoreboardRepository rp;
	public List<HockeyScoreboard> gethscoreboard(int id){
	List <HockeyScoreboard> hsb = rp.findByGameid(id);
	return hsb;
	}
	public HockeyScoreboard save(HockeyScoreboard hs) {
		return rp.save(hs);
	}
	public HockeyScoreboard findById(int id) {
		return rp.findById(id);
		}
@Transactional
public void deleteById(int id) {
	rp.deleteById(id);
}	
}
