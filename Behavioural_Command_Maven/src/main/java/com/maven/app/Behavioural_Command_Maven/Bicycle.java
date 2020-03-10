package com.maven.app.Behavioural_Command_Maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Bicycle implements Vehicle{ 
	private static final Logger logger = LogManager.getLogger(App.class);
	
	int speed; 
	int gear; 
	
	 
	public void changeGear(int newGear){ 
		
		gear = newGear; 
	} 
	
	
	public void speedUp(int increment){ 
		
		speed = speed + increment; 
	} 
	
	public void applyBrakes(int decrement){ 
		
		speed = speed - decrement; 
	} 
	
	public void printStates() { 
		logger.error("speed: " + speed 
			+ " gear: " + gear); 
	} 
} 

