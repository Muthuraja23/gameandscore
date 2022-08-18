package com.chainsys.gameandscore.repository;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.gameandscore.model.Login;

public interface LoginRepository extends CrudRepository<Login, String> {
	Login findByAdminIdAndPassword(String id, String password);
}
