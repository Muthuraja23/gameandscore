package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.CricketScoreboard;

@Repository
public interface CricketScoreboardRepository extends JpaRepository<CricketScoreboard,Integer>{

	CricketScoreboard findById(int id);
	CricketScoreboard save(CricketScoreboard cs);
	void deleteById(int id);
	List <CricketScoreboard> findAll();
	List<CricketScoreboard> findByGameid(int id);
	
}
