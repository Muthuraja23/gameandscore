package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.gameandscore.model.FootballScoreboard;
import com.chainsys.gameandscore.repository.FootballScoreboardRepository;

@Service
public class FootballScoreboardService {
	@Autowired
	private FootballScoreboardRepository rp;
	public List<FootballScoreboard> getfbscoreboard(){
	return rp.findAll();
	}
	public FootballScoreboard save(FootballScoreboard fs) {
		return rp.save(fs);
	}
	public FootballScoreboard findById(int id) {
		return rp.findById(id);
		}
	public List<FootballScoreboard> findByGameId(int id){
		return rp.findByGameid(id);
	}

	
public void deleteById(int id) {
	rp.deleteById(id);
}
	
}
