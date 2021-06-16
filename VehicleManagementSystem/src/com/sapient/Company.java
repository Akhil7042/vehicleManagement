package com.sapient;

public class Company {
	private String companyName;
	private String modelName;
	public Company(String companyName, String modelName) {
		super();
		this.companyName = companyName;
		this.modelName = modelName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	

}
