package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.HockeyGoals;

@Repository
public interface HockeyGoalsRepository extends JpaRepository<HockeyGoals,Integer>{

	HockeyGoals findById(int id);
	HockeyGoals save(HockeyGoals hky);
	void deleteById(int id);
	List <HockeyGoals> findAll();
	List <HockeyGoals> findByGameid(int id);
}
