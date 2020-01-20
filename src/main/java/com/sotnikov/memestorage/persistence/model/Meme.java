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

	protected Meme() { } 
	
    public Meme(String fileName, String description, Timestamp creationDate, Timestamp modifyingDate) {
		super();
		this.fileName = fileName;
		this.description = description;
		this.creationDate = creationDate;
		this.modifyingDate = modifyingDate;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
    @Column(name = "filename")
    String fileName;
    @Column(name = "description")
	String description;
    @Column(name = "creationDate")
	Timestamp creationDate;
    @Column(name = "modifyingDate")
	Timestamp modifyingDate;
	
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
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Meme [fileName=" + fileName + ", description=" + description + ", creationDate=" + creationDate
				+ ", modifyingDate=" + modifyingDate + "]";
	}

	
	
	
	
}
