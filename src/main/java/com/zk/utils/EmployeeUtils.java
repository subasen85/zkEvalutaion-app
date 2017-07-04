package com.zk.utils;

import org.springframework.stereotype.Service;

import com.zk.dto.EmployeeDTO;
import com.zk.model.EmployeeInfo;

@Service
public class EmployeeUtils {

	// Convert from employeeInfo to employeeDTO object
	public EmployeeDTO convertEmployeeInfoToEmployeeDTO(EmployeeInfo employeeInfo) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(employeeInfo.getId());
		employeeDTO.setEmpName(employeeInfo.getEmpName());
		employeeDTO.setEmpDesignation(employeeInfo.getEmpDesignation());
		employeeDTO.setSalary(employeeInfo.getSalary());
		employeeDTO.setEmailId(employeeInfo.getEmailId());
		employeeDTO.setMobileNo(employeeInfo.getMobileNo());
		employeeDTO.setStatus(employeeInfo.getStatus());
		employeeDTO.setCreated_Date(employeeInfo.getCreated_Date());
		employeeDTO.setVersionNo(employeeInfo.getVersionNo());
		employeeDTO.setGender(employeeInfo.getGender());
		employeeDTO.setEmpType(employeeInfo.getEmpType());
		return employeeDTO;
	}

}
