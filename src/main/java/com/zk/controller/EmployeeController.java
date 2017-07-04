package com.zk.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.zk.dto.EmployeeDTO;
import com.zk.dto.StatusResponseDTO;
import com.zk.service.EmployeeService;

@RestController
@RequestMapping(value = "/zk-app/api/employee")
@CrossOrigin

public class EmployeeController {

	public static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	// Get all employee list from DB
	@CrossOrigin
	@RequestMapping(value="all", method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody ResponseEntity<String> getEmployeeMethod () {
		LOG.info("Exit the EmployeeController (getEmployeeMethod API)... ");
		StatusResponseDTO statusResponseDTO = new StatusResponseDTO();
		statusResponseDTO.setStatus(env.getProperty("success"));

		try {
			List<EmployeeDTO> employeeList = employeeService.getAllEmployeeList();
			statusResponseDTO.setEmployee(employeeList);
			statusResponseDTO.setMessage(env.getProperty("employee.list.available"));
			LOG.info("Exit the EmployeeController (getEmployeeMethod API)... ");
			return new ResponseEntity<String>(new Gson().toJson(statusResponseDTO), HttpStatus.OK);
		} catch (Exception e) {
			LOG.error("Error occured in getEmployeeMethod method ");
			e.printStackTrace();
			statusResponseDTO.setStatus(env.getProperty("failure"));
			statusResponseDTO.setMessage(env.getProperty("server.problem"));
			return new ResponseEntity<String>(new Gson().toJson(statusResponseDTO), HttpStatus.PARTIAL_CONTENT);
		}
	}
}
