package com.sapient;

public class CarWrapper {
	private Vehicle vehicle;
	private Company company;
	private NutsAndBolts nutsBolts;
	public CarWrapper(Vehicle vehicle, Company company, NutsAndBolts nutsBolts) {
		super();
		this.vehicle = vehicle;
		this.company = company;
		this.nutsBolts = nutsBolts;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public NutsAndBolts getNutsBolts() {
		return nutsBolts;
	}
	public void setNutsBolts(NutsAndBolts nutsBolts) {
		this.nutsBolts = nutsBolts;
	}
	
	
	
	

}
