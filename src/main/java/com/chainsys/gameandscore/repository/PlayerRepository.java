package com.chainsys.gameandscore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chainsys.gameandscore.model.Player;

public interface PlayerRepository extends JpaRepository<Player,Integer>{

}
