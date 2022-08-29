package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.TeamPlayerDetails;

@Repository
public interface TeamPlayerDetailsRepository extends JpaRepository<TeamPlayerDetails,Integer>{
	TeamPlayerDetails findById(int id);
	TeamPlayerDetails save(TeamPlayerDetails tp);
	void deleteById(int tmid);
	List <TeamPlayerDetails> findAll();
	TeamPlayerDetails findByName(String name);
}
