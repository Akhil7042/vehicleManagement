package com.sapient;

public class Vehicle {
	
	// Most general properties of car
	private int numberPlate;
	private int wheelsWidth;
	public Vehicle(int numberPlate, int wheelsWidth) {
		super();
		this.numberPlate = numberPlate;
		this.wheelsWidth = wheelsWidth;
	}
	public int getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(int numberPlate) {
		this.numberPlate = numberPlate;
	}
	public int getWheelsWidth() {
		return wheelsWidth;
	}
	public void setWheelsWidth(int wheelsWidth) {
		this.wheelsWidth = wheelsWidth;
	}
	
	

}
