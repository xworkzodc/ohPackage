package com.xworkz.browser.sub;
import com.xworkz.browser.*;
public class MozillaBrowser extends Browser {
 MozillaBrowser()
	{
	this();
	System.out.println("ITS A DEFAULT CONSTRACTOR");
	
	}
 MozillaBrowser(String name) {
	this(name);
	System.out.println("name of browser");
}
 MozillaBrowser(String version)
{
	this(version);
	System.out.println("version of browser");
	
}
 public void showTime() {

		System.out.println("Overriding method from browser ");
	}
public void cleanUp() {

		System.out.println("CLEAN up method from Mozilla browser");
	}
	@Override
	public void connect() {

		System.out.println("Connect method from child class which overriden from parent browser");
		super.connect();
	}

@Override
	public String getCompany() {

		System.out.println("overriding getCompany from the child class");
		return super.getCompany();
	}

	@Override
	public String getName() {

		System.out.println("Overriding the child class which is over riden");
		return super.getName();
	}
}

