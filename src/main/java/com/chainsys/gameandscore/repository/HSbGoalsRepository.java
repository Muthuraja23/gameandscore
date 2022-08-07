package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.HSbGoals;

@Repository
public interface HSbGoalsRepository extends JpaRepository<HSbGoals,Integer>{

	HSbGoals findById(int id);
	HSbGoals save(HSbGoals hky);
	void deleteById(int id);
	List <HSbGoals> findAll();
}
