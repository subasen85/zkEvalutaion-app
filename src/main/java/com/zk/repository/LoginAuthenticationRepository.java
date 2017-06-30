package com.zk.repository;

import org.springframework.data.repository.CrudRepository;

import com.zk.model.LoginInfo;

public interface LoginAuthenticationRepository extends CrudRepository<LoginInfo, Integer>{

	public Integer countLoginInfoByUsernameAndPassword(String username, String password);

	
}
