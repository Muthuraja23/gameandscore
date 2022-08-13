package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.CrSbBattingDetails;
import com.chainsys.gameandscore.repository.Batting2Repository;

@Service
public class Batting2Service {
@Autowired
private Batting2Repository bat2;
public List<CrSbBattingDetails> getCrSbBattingDetails() {
	List<CrSbBattingDetails> details2list = bat2.findAll();
	return details2list;
}

public CrSbBattingDetails save(CrSbBattingDetails bd2) {
	return bat2.save(bd2);
}

public CrSbBattingDetails findById(int id) {
	return bat2.findById(id);
}

@Transactional
public void deleteById(int id) {
	bat2.deleteById(id);
}
}
