package com.chris.tictactoe.service.dao;

import java.util.Collection;

import com.chris.tictactoe.service.model.Entity;

public interface DAO<E extends Entity> {
	
	Collection<E> getAll();
	
	E get(String id);
	
	void delete(String id);
	
	String save(E entity);
	
	void update(E entity);

}
