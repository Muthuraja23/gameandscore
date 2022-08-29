package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.FootballGoals;
@Repository
public interface FootballGoalsRepository extends JpaRepository<FootballGoals,Integer>{
	FootballGoals findById(int id);
	FootballGoals save(FootballGoals fb);
	void deleteById(int id);
	List <FootballGoals> findAll();
	List <FootballGoals> findByGameid(int id);

}
