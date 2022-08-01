package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chainsys.gameandscore.model.Game;
import com.chainsys.gameandscore.model.Sports;

public interface GameRepository extends JpaRepository<Game,Integer>{
	Game save(Game gm);
	List<Game> findAll();
	Game findById(int id);
	void deleteById(int gm_id);
}
