package com.sapient;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      CarWrapper car = new CarWrapper(new Vehicle(123, 2),new Company("Maruti", "Alto"), new NutsAndBolts(1, 2));
      
      System.out.println(car.getNutsBolts());
		
	}

}
