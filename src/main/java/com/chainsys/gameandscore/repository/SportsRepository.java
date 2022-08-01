package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.Sports;
@Repository
public interface SportsRepository extends JpaRepository<Sports, Integer> {
	Sports save(Sports sp);
	List<Sports> findAll();
	Sports findById(int id);
	void deleteById(int sp_id);
}
