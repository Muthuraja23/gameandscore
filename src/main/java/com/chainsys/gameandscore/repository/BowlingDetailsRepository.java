package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.BowlingDetails;

@Repository
public interface BowlingDetailsRepository extends JpaRepository<BowlingDetails,Integer>{
	BowlingDetails findById(int id);
	BowlingDetails save(BowlingDetails bl);
	void deleteById(int id);
	List <BowlingDetails> findAll();
	List<BowlingDetails> findByGameid(int id);
	List<BowlingDetails> findByGameidAndTeam(int id,String team);
}
