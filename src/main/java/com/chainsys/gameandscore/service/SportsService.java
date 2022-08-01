package com.chainsys.gameandscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.gameandscore.model.Sports;
import com.chainsys.gameandscore.repository.SportsRepository;

@Service
public class SportsService {
@Autowired
private SportsRepository repo;
public List<Sports> getSports() {
	List<Sports> sportslist = repo.findAll();
	return sportslist;
}
public Sports save(Sports sp) {
	return repo.save(sp);
}
public Sports findById(int id) {
	return repo.findById(id);
}
@Transactional
public void deleteById(int id) {
	repo.deleteById(id);
}
}
