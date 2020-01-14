package com.sotnikov.memestorage.dao;

import org.springframework.stereotype.Repository;

import com.sotnikov.memestorage.persistence.model.Meme;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface MemeRepository extends CrudRepository<Meme, Long> {

}
