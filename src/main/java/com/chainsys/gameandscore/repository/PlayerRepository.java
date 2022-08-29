package com.chainsys.gameandscore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.gameandscore.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
	Player findById(int id);
	Player save(Player pl);
	void deleteById(int id);
	List <Player> findAll();
	List<Player> findByTeamid(int id);
	Player findByName(String name);
	
}
