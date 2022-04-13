package com.xworkz.overrid;

public class FiberInternet extends Internet {
	public void details() {
		System.out.println(super.provider);
		System.out.println(super.speed);
		System.out.println(super.type);
		System.out.println(super.plan);
		super.connect();
	}

	protected void connect() {
		System.out.println("overriding method from public");
	}

}
