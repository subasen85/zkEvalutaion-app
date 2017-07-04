package com.zk.repository;

import org.springframework.data.repository.CrudRepository;

import com.zk.model.EmployeeInfo;

public interface EmployeeRepository extends CrudRepository<EmployeeInfo, Integer>{

	
	
}
