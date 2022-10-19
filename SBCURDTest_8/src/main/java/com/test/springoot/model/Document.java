package com.test.springoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="docs")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Name;
	private String Type;
	private String UploadedFilePath;
	public Document() {
		super();
		
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getUploadedFilePath() {
		return UploadedFilePath;
	}
	public void setUploadedFilePath(String uploadedFilePath) {
		UploadedFilePath = uploadedFilePath;
	}

	

}
