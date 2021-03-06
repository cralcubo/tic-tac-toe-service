package com.chris.tictactoe.service.model;

import com.chris.tictactoe.service.exceptions.UnsupportedShapeException;

public enum PlayerShape {
	CIRCLE("O"), CROSS("X");
	
	private String aShape;
	
	private PlayerShape(String aShape) {
		this.aShape = aShape;
	}
	
	public static PlayerShape getPlayerShape(String shapeStr) throws UnsupportedShapeException{
		for(PlayerShape shape : PlayerShape.values()){
			if(shape.aShape.equalsIgnoreCase(shapeStr)){
				return shape;
			}
		}
		throw new UnsupportedShapeException();
	}
	
	public String getShape(){
		return aShape;
	}

}
