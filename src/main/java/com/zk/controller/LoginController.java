package com.zk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.zk.dto.LoginDTO;
import com.zk.dto.StatusResponseDTO;
import com.zk.service.LoginService;
import com.zk.utils.LoginUtils;

@RestController
@RequestMapping(value = "/zk-app/api/login_info")
@CrossOrigin

public class LoginController {

	public static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private Environment env;
	
	@Autowired
	private LoginService LoginService;
	
	@Autowired
	private LoginUtils loginUtils;
	
	// API for authenticating the login credential
	@CrossOrigin
	@RequestMapping(value="login", method = RequestMethod.POST, produces = { "application/json" })
	public @ResponseBody ResponseEntity<String> loginMethod (@RequestBody LoginDTO loginDTO) {
		System.err.println("Login success");
		
		StatusResponseDTO statusResponseDTO = new StatusResponseDTO();
		statusResponseDTO.setStatus(env.getProperty("success"));
		
		if (!env.getProperty("success").equals(loginUtils.LoginValidation(loginDTO))) {
			statusResponseDTO.setStatus(env.getProperty("failure"));
			statusResponseDTO.setMessage(env.getProperty("incorrectdetails"));
			return new ResponseEntity<String>(new Gson().toJson(statusResponseDTO), HttpStatus.PARTIAL_CONTENT);
		} 
		
		String result = LoginService.isAuthenticateLogin(loginDTO);
		if (!env.getProperty("success").equals(result)) {
			statusResponseDTO.setStatus(env.getProperty("failure"));
			statusResponseDTO.setMessage(result);
			return new ResponseEntity<String>(new Gson().toJson(statusResponseDTO), HttpStatus.PARTIAL_CONTENT);
		}
		
		statusResponseDTO.setMessage("Authentication Success");
		return new ResponseEntity<String>(new Gson().toJson(statusResponseDTO), HttpStatus.OK);
		
	}
}
