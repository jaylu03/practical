package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorage {
	
	private String uploadF;
	
	public String getUploadF() {
		return uploadF;
	}
	public void setUploadF(String uploadF) {
		this.uploadF = uploadF;
	}
}
