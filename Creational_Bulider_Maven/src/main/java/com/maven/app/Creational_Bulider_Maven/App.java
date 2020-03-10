package com.maven.app.Creational_Bulider_Maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	House object1 =  new House.Bulider(5, 6, 8).bulid();
		logger.error("The Number of windows in the house are "+object1.getWindows());
		logger.error("The Number of doors in the house are "+object1.getDoors());
		logger.error("The Number of rooms in the house are "+object1.getRooms());
		logger.error("The house has a garage "+object1.isHasGarage());
		logger.error("The house has a swimming pool "+object1.isHasSwimmingPool());
		logger.error("The house has a statue "+object1.isHasStatue());
		House object2  = new House.Bulider(5, 6, 8).setHasGarage(true).setHasStatue(true).setHasSwimmingPool(true).bulid();
		logger.error("The Number of windows in the house are "+object2.getWindows());
		logger.error("The Number of doors in the house are "+object2.getDoors());
		logger.error("The Number of rooms in the house are "+object2.getRooms());
		logger.error("The house has a garage "+object2.isHasGarage());
		logger.error("The house has a swimming pool "+object2.isHasSwimmingPool());
		logger.error("The house has a statue "+object2.isHasStatue());
    }
}
