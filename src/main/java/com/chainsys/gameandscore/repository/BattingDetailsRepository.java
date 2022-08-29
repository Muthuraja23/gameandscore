package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.BattingDetails;
@Repository
public interface BattingDetailsRepository extends JpaRepository<BattingDetails,Integer>{

	BattingDetails findById(int id);
	BattingDetails save(BattingDetails bd);
	void deleteById(int id);
	List <BattingDetails> findAll();
	List<BattingDetails> findByGameid(int id);
	List<BattingDetails> findByGameidAndTeam(int id,String team);
}
