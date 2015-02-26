package com.esiea.log;

public enum Level {

	DEBUG(1), INFO(2), WARN(3), ERROR(4);
	
	private int levelValue;
	
	private Level(int levelValue){
		this.levelValue = levelValue;
	}
	
	public int getLevelValue(){
		return levelValue;
	}
	
}

