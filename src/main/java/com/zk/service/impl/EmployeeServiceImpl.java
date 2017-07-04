package com.zk.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zk.dto.EmployeeDTO;
import com.zk.model.EmployeeInfo;
import com.zk.repository.EmployeeRepository;
import com.zk.service.EmployeeService;
import com.zk.utils.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeUtils employeeUtils;
	
	// Get all Employee List from DB
	@Override
	public List<EmployeeDTO> getAllEmployeeList() {
		List<EmployeeDTO> employeeDTOList = new ArrayList<EmployeeDTO>();
		List<EmployeeInfo> employeeList = (List<EmployeeInfo>) employeeRepository.findAll();
		
		if (employeeList != null && employeeList.size() > 0) {
			for (EmployeeInfo employeeInfo : employeeList) {
				employeeDTOList.add(employeeUtils.convertEmployeeInfoToEmployeeDTO(employeeInfo));
			}
		}
		return employeeDTOList;
	}

}
