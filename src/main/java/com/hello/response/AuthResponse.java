package com.hello.response;


import com.hello.domain.USER_ROLE;

import lombok.Data;

@Data
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;
	


}
