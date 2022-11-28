package com.example;

import java.net.MalformedURLException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileNotFoundException extends RuntimeException {

	public MyFileNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public MyFileNotFoundException(String string, Throwable e) {
		// TODO Auto-generated constructor stub
		super(string, e);
	}

}
