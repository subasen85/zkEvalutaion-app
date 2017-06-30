package com.zk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.zk.dto.LoginDTO;
import com.zk.repository.LoginAuthenticationRepository;
import com.zk.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private Environment env;
	
	@Autowired
	private LoginAuthenticationRepository loginRepository;
	
	@Override
	public String isAuthenticateLogin(LoginDTO loginDTO) {
		
		String message = env.getProperty("failure");
		Integer loginCount = loginRepository.countLoginInfoByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
		if (loginCount == 1) {
			message = env.getProperty("success");
		}
		return message;
	}
	
}
