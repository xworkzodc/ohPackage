package com.xworkz.overrid;

import com.xworkz.overrid.ModemInternet;

public class Customer {
	void connectToInternet() {
		Internet internet = new Internet();
		System.out.println(internet.speed);
		System.out.println(internet.provider);
		System.out.println(internet.plan);
		System.out.println(internet.type);
		internet.connect();
		FiberInternet fiberInternet = new FiberInternet();
		System.out.println(fiberInternet.plan);
		System.out.println(fiberInternet.speed);
		ModemInternet modemInternet = new ModemInternet();
		System.out.println(modemInternet.plan);
		System.out.println(modemInternet.type);
		System.out.println(modemInternet.speed);
		modemInternet.connect();
	}

}
