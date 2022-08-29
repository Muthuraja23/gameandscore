package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.BowlingDetails;
import com.chainsys.gameandscore.repository.BowlingDetailsRepository;

@Service
public class BowlingDetailsService {
	@Autowired
	private BowlingDetailsRepository rp;
	public List<BowlingDetails> getBowlingDetails(){
		return rp.findAll();
		}
		public BowlingDetails save(BowlingDetails bl) {
			return rp.save(bl);
		}
		public BowlingDetails findById(int id) {
			return rp.findById(id);
			}
		public List<BowlingDetails> getBowlingByGameId(int id,String team){
			return rp.findByGameidAndTeam(id,team);
		}
	public void deleteById(int id) {
		rp.deleteById(id);
	}
}
