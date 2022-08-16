package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.CrSbBattingDetails;
@Repository
public interface CrSbBattingDetailsRepository extends JpaRepository<CrSbBattingDetails,Integer>{

	CrSbBattingDetails findById(int id);
	CrSbBattingDetails save(CrSbBattingDetails bd);
	void deleteById(int id);
	List <CrSbBattingDetails> findAll();
	List<CrSbBattingDetails> findByGameid(int id);
}
