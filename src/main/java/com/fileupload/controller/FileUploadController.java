package com.fileupload.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	
	@PostMapping("/uploadfile")
	public ResponseEntity<String> uploadfile(){
		
		
		
		return ResponseEntity.ok("working");
	}

}
