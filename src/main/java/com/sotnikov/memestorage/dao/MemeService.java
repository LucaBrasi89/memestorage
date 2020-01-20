package com.sotnikov.memestorage.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sotnikov.memestorage.persistence.model.Meme;

@Service
public class MemeService {
	
	@Autowired
    private MemeRepository repository;

    public List<Meme> findAll() {

        return (List<Meme>) repository.findAll();
    }
    
    
    public void save(Meme m) {
    	
    	repository.save(m);
    	
    }
	

}
