package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.Sports;
@Repository
public interface SportsRepository extends CrudRepository<Sports, Integer> {
	Sports save(Sports sp);

	List<Sports> findAll();

	Sports findById(int id);

	void deleteById(int id);
}
