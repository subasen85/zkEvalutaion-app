package com.zk.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.zk.dto.LoginDTO;

@Service
public class LoginUtils {

	public static final Logger LOG = LoggerFactory.getLogger(LoginUtils.class);
	
	@Autowired
	private Environment env;
	
	
	public String LoginValidation(LoginDTO loginDTO) {
		if (loginDTO.getUsername() != null && !StringUtils.isEmpty(loginDTO.getUsername())
				&& loginDTO.getPassword() != null && !StringUtils.isEmpty(loginDTO.getPassword())) {
			return env.getProperty("success");
		}
		return env.getProperty("failure");
	}
}
