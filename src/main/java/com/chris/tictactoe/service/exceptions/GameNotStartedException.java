package com.chris.tictactoe.service.exceptions;

public class GameNotStartedException extends Exception {

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Game was not started";
	
	public GameNotStartedException() {
		super(MESSAGE);
	}
	

}
