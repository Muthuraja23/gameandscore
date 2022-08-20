package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.TeamPlayerDetails;
import com.chainsys.gameandscore.repository.TeamPlayerDetailsRepository;

@Service
public class TeamPlayerDetailsService {

	@Autowired
	private TeamPlayerDetailsRepository rp;

	public List<TeamPlayerDetails> getTeamPlayerDetails() {
		return rp.findAll();
	}

	public TeamPlayerDetails save(TeamPlayerDetails tp) {
		return rp.save(tp);
	}

	public TeamPlayerDetails findById(int id) {
		return rp.findById(id);
	}

	@Transactional
	public void deleteById(int id) {
		rp.deleteById(id);
	}

}
