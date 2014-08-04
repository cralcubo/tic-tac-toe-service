package com.chris.tictactoe.service.dao;

import java.util.HashMap;
import java.util.Map;

import com.chris.tictactoe.service.model.Game;

public class GameStaticRepository extends StaticRepository<Game> {
	private final static Map<String, Game> REPOSITORY = new HashMap<String, Game>();
	
	private static GameStaticRepository gameStaticRepository;
	
	private static int idGenerator = 0;
	
	public GameStaticRepository(Map<String, Game> staticRepo) {
		super(staticRepo);
	}
	
	@Override
	public String save(Game entity) {
		idGenerator++;
		entity.setId(String.valueOf(idGenerator));
		
		super.save(entity);
		
		return String.valueOf(idGenerator);
	}
	
	public static GameStaticRepository getInstance(){
		if(gameStaticRepository == null){
			gameStaticRepository = new GameStaticRepository(REPOSITORY);
		}
		
		return gameStaticRepository;
	}
	

}
