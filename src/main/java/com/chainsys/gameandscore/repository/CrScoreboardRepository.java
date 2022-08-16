package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.CrScoreboard;

@Repository
public interface CrScoreboardRepository extends JpaRepository<CrScoreboard,Integer>{

	CrScoreboard findById(int id);
	CrScoreboard save(CrScoreboard cs);
	void deleteById(int id);
	List <CrScoreboard> findAll();
	List<CrScoreboard> findByGameid(int id);
	
}
