package com.xworkz.overrid;

public class Internet {
	int speed;
	String provider;
	public String type;
	protected String plan;
	private double bandwidth;

	public Internet() {

	}

	protected void connect() {
		System.out.println("running connect....");
	}

}
