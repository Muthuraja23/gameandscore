package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.CrSbBowlingDetails;

@Repository
public interface CrSbBowlingDetailsRepository extends JpaRepository<CrSbBowlingDetails,Integer>{
	CrSbBowlingDetails findById(int id);
	CrSbBowlingDetails save(CrSbBowlingDetails bl);
	void deleteById(int id);
	List <CrSbBowlingDetails> findAll();
	List<CrSbBowlingDetails> findByGameid(int id);
}
