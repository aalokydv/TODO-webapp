package com.aalok.springboot.firstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean Authenticate(String username , String password) {
		boolean isValidUserName = username.equalsIgnoreCase("aalok");
		boolean isValidPassword = password.equalsIgnoreCase("yadav");
		
		
		return isValidUserName && isValidPassword;

		
	}

}
