package com.example;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileStorageService {

	private final Path fileStorageLocation;

	@Autowired
	public FileStorageService(FileStorage fileStorage) {
		this.fileStorageLocation = Paths.get(fileStorage.getUploadF()).toAbsolutePath().normalize();
		
		try {
			Files.createDirectories(this.fileStorageLocation);
		}
		catch(Exception e) {
			throw new FileStorageException("Could not create", e);
		}
	}
	
	public Resource loadFileAsResource(String fileName) {
		
		try {
			Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
			Resource res = new UrlResource(filePath.toUri());
			
			if(res.exists()) {
				return res;
			}
			else {
				throw new MyFileNotFoundException("File not found" + fileName);	
			}
		}
	
		catch(MalformedURLException e) {
			throw new MyFileNotFoundException("File not found" + fileName, e);
			}
	}

	public String storeFile(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}
}
