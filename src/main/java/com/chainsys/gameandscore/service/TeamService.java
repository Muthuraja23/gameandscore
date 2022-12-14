package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.Team;
import com.chainsys.gameandscore.repository.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository rp;

	public List<Team> getTeams() {
		return rp.findAll();
	}

	public Team save(Team tm) {
		return rp.save(tm);
	}
	public Team getTeamByName(String name) {
		return rp.findByTeamname(name);
	}
	public Team findById(int id) {
		return rp.findById(id);
	}

	public void deleteById(int id) {
		rp.deleteById(id);
	}

}
