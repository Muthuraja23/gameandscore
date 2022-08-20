package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer> {
	Game save(Game gm);

	List<Game> findAll();

	Game findById(int id);

	void deleteById(int id);
	List<Game>findBySportsid(int id);

}
