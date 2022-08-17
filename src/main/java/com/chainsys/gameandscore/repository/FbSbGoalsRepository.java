package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.FbSbGoals;
@Repository
public interface FbSbGoalsRepository extends JpaRepository<FbSbGoals,Integer>{
	FbSbGoals findById(int id);
	FbSbGoals save(FbSbGoals fb);
	void deleteById(int id);
	List <FbSbGoals> findAll();
	List <FbSbGoals> findByGameid(int id);

}
