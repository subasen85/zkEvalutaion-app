package com.zk.dto;

import java.util.List;

public class StatusResponseDTO {

	private String status;
	private String message;
	private List<EmployeeDTO> employee;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<EmployeeDTO> getEmployee() {
		return employee;
	}
	public void setEmployee(List<EmployeeDTO> employee) {
		this.employee = employee;
	}
	
}
