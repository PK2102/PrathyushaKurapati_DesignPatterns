package com.maven.app.Creational_Bulider_Maven;

public class House {
private int windows;
	
	private int doors;
	private int rooms;
	// optional parameters
	private boolean hasGarage;
	private boolean hasSwimmingPool;
	private boolean hasStatue;
	private House(Bulider bulider) {
		// TODO Auto-generated constructor stub
		this.windows = bulider.windows;
		this.doors = bulider.doors;
		this.hasGarage = bulider.hasGarage;
		this.hasSwimmingPool =bulider. hasSwimmingPool;
		this.hasStatue = bulider.hasStatue;
	}
	
	
	public int getWindows() {
		return windows;
	}


	public int getDoors() {
		return doors;
	}


	public int getRooms() {
		return rooms;
	}


	public boolean isHasGarage() {
		return hasGarage;
	}


	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}
	public boolean isHasStatue() {
		return hasStatue;
	}


	public static class Bulider
	{
		//required parameters
		private int windows;
		private int doors;
		private int rooms;
		// optional parameters
		private boolean hasGarage;
		private boolean hasSwimmingPool;
		private boolean hasStatue;
		
		public Bulider(int windows,int doors ,int rooms)
		{
			this.windows = windows;
			this.doors = doors;
			this.rooms = rooms;
		}
		
		
		public Bulider setHasGarage(boolean hasGarage) {
			this.hasGarage = hasGarage;
			return this;
		}


		public Bulider setHasSwimmingPool(boolean hasSwimmingPool) {
			this.hasSwimmingPool = hasSwimmingPool;
			return this;
		}
		public Bulider setHasStatue(boolean hasStatue) {
			this.hasStatue = hasStatue;
			return this;
		}


		public House bulid()
		{
			return  new House(this);
		}


		
		
	}
	

}
