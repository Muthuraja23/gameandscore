package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.gameandscore.model.CrSbBattingDetails;

public interface Batting2Repository extends CrudRepository<CrSbBattingDetails,Integer> {
	CrSbBattingDetails findById(int id);
	CrSbBattingDetails save(CrSbBattingDetails bd2);
	void deleteById(int id);
	List <CrSbBattingDetails> findAll();
    
}
