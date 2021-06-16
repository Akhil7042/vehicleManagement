package com.sapient;

public class NutsAndBolts {
 
	 private int nRadius;
	private int bRadius;
	public NutsAndBolts(int nRadius, int bRadius) {
		super();
		this.nRadius = nRadius;
		this.bRadius = bRadius;
	}
	public int getnRadius() {
		return nRadius;
	}
	public void setnRadius(int nRadius) {
		this.nRadius = nRadius;
	}
	public int getbRadius() {
		return bRadius;
	}
	public void setbRadius(int bRadius) {
		this.bRadius = bRadius;
	}
	@Override
	public String toString() {
		return "NutsAndBolts [nRadius=" + nRadius + ", bRadius=" + bRadius + "]";
	}
	
	
}
