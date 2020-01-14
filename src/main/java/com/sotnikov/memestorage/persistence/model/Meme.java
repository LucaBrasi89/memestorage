package com.sotnikov.memestorage.persistence.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "memes")
public class Meme {

	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
    @Column(name = "filename")
    String fileName;
    @Column(name = "description")
	String description;
    @Column(name = "creationDate")
	Timestamp creationDate;
    @Column(name = "modifyingDate")
	Timestamp modifyingDate;
	
	ArrayList<String> tags;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getModifyingDate() {
		return modifyingDate;
	}

	public void setModifyingDate(Timestamp modifyingDate) {
		this.modifyingDate = modifyingDate;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
	
	
	
}
