package com.maven.app.Behavioural_Command_Maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Bicycle bicycle = new Bicycle(); 
		bicycle.changeGear(2); 
		bicycle.speedUp(3); 
		bicycle.applyBrakes(1); 
		
		logger.error("Bicycle present state :"); 
		bicycle.printStates(); 
		
		 
		Bike bike = new Bike(); 
		bike.changeGear(1); 
		bike.speedUp(4); 
		bike.applyBrakes(3); 
		
		logger.error("Bike present state :"); 
		bike.printStates(); 
    }
}
