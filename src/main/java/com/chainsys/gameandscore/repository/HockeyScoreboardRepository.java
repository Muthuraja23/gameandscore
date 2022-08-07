package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.HockeyScoreboard;

@Repository
public interface HockeyScoreboardRepository extends JpaRepository<HockeyScoreboard,Integer>{

	HockeyScoreboard findById(int id);
	HockeyScoreboard save(HockeyScoreboard hs);
	void deleteById(int id);
	List <HockeyScoreboard> findAll();

}
