package com.jhoselyn.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jhoselyn.models.Tractor;

@Repository
public interface ITractor extends CrudRepository<Tractor, Integer> {
	
}
