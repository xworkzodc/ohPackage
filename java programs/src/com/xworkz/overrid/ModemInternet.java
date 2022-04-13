package com.xworkz.overrid;

import com.xworkz.overrid.Internet;

public class ModemInternet extends Internet {
	public void details() {
		System.out.println(super.type);
		System.out.println(super.plan);
		super.connect();
	}

	protected void connect() {
		System.out.println("overriding method from parent");
	}

}
