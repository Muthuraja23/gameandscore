package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.CrSbBowlingDetails;
import com.chainsys.gameandscore.repository.CrSbBowlingDetailsRepository;

@Service
public class CrSbBowlingDetailsService {
	@Autowired
	private CrSbBowlingDetailsRepository rp;
	public List<CrSbBowlingDetails> getBowlingDetails(){
		List <CrSbBowlingDetails> bowl = rp.findAll();
		return bowl;
		}
		public CrSbBowlingDetails save(CrSbBowlingDetails bl) {
			return rp.save(bl);
		}
		public CrSbBowlingDetails findById(int id) {
			return rp.findById(id);
			}
		public List<CrSbBowlingDetails> getBowlingByGameId(int id){
			return rp.findByGameid(id);
		}
	@Transactional
	public void deleteById(int id) {
		rp.deleteById(id);
	}
}
