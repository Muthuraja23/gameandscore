package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.Team;
@Repository
public interface TeamRepository extends JpaRepository<Team,Integer> {
	Team findById(int id);
	Team save(Team tm);
	void deleteById(int tmid);
	List <Team> findAll();
	Team findByTeamname(String name);
}
