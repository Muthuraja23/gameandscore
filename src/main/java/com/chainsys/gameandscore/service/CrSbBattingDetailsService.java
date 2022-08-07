package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.CrSbBattingDetails;
import com.chainsys.gameandscore.repository.CrSbBattingDetailsRepository;

@Service
public class CrSbBattingDetailsService {
	@Autowired
	private CrSbBattingDetailsRepository rp;

	public List<CrSbBattingDetails> getCrSbBattingDetails() {
		List<CrSbBattingDetails> detailslist = rp.findAll();
		return detailslist;
	}

	public CrSbBattingDetails save(CrSbBattingDetails bd) {
		return rp.save(bd);
	}

	public CrSbBattingDetails findById(int id) {
		return rp.findById(id);
	}

	@Transactional
	public void deleteById(int id) {
		rp.deleteById(id);
	}

}
