package com.test.springoot.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.test.springoot.model.Document;
import com.test.springoot.util.DocUploadUtil;

import org.springframework.util.StringUtils;


@RestController
public class DocUploadController {
	@PostMapping("/uploadFile")
	public ResponseEntity<Document> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		long size = multipartFile.getSize();

		String filepath = DocUploadUtil.saveFile(fileName, multipartFile);

		Document doc = new Document();
		doc.setName(name);
		doc.setType(type);
		doc.setUploadedFilePath("/uploadedFile/" + filepath);

		return new ResponseEntity<>(doc, HttpStatus.OK);
	}

}
