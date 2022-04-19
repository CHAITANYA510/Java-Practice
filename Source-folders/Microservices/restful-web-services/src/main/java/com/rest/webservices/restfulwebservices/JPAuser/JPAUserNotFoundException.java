package com.rest.webservices.restfulwebservices.JPAuser;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class JPAUserNotFoundException extends RuntimeException {
	public JPAUserNotFoundException(String message) {
		super(message);
	}
}
