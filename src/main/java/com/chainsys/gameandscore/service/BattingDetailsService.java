package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.BattingDetails;
import com.chainsys.gameandscore.repository.BattingDetailsRepository;

@Service
public class BattingDetailsService {
	@Autowired
	private BattingDetailsRepository rp;

	public List<BattingDetails> getCrSbBattingDetails() {
		return rp.findAll();
	}

	public BattingDetails save(BattingDetails bd) {
		return rp.save(bd);
	}
	public List<BattingDetails> getBattingByGameId(int id){
		return rp.findByGameid(id);
	}
	public BattingDetails findById(int id) {
		return rp.findById(id);
	}
	public List<BattingDetails> getCrSbBattingDetails(int id,String team){
		return rp.findByGameidAndTeam(id,team);
	}
	public void deleteById(int id) {
		rp.deleteById(id);
	}

}
