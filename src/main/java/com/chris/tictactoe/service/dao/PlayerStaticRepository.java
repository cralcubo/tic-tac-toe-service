package com.chris.tictactoe.service.dao;

import java.util.HashMap;
import java.util.Map;

import com.chris.tictactoe.service.model.GamePlayer;

public class PlayerStaticRepository extends StaticRepository<GamePlayer>  {
	
	private static PlayerStaticRepository playerStaticRepository;
	
	private static final Map<String, GamePlayer> REPO = new HashMap<>();
	
	public PlayerStaticRepository(Map<String, GamePlayer> staticRepo) {
		super(staticRepo);
	}
	
	
	public static PlayerStaticRepository getInstance(){
		if(playerStaticRepository == null){
			playerStaticRepository = new PlayerStaticRepository(REPO);
		}
		
		return playerStaticRepository;
	}

	
}
