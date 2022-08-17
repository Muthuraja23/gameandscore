package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.FootballScoreboard;

@Repository
public interface FootballScoreboardRepository extends JpaRepository<FootballScoreboard,Integer>{
	FootballScoreboard findById(int id);
	FootballScoreboard save(FootballScoreboard fs);
	void deleteById(int id);
	List <FootballScoreboard> findAll();
	List<FootballScoreboard> findByGameid(int id);

}
