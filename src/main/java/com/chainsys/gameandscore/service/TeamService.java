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
	public List<Team> getTeams(){
	List <Team> teamlist = rp.findAll();
	return teamlist;
	}
	public Team save(Team tm) {
		return rp.save(tm);
	}
	public Team findById(int id) {
		return rp.findById(id);
		}
@Transactional
public void deleteById(int id) {
	rp.deleteById(id);
}
                                
}

