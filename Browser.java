package com.xworkz.browser;

public abstract class Browser {
		
String name="F FIBERNET";
String version="F 2.0";
String company="FIBER";
public Browser(String name,String version,String company) 
		{
this.name=name;
this.version=version;
this.company=company;
System.out.println("PARAMETERISED BROWSER CONSTRUCTOR");
System.out.println(name);
System.out.println(version);
System.out.println(company);
}
public void connect()
{
	System.out.println("this is a concrete method");
}
public abstract void developerTool();
{
System.out.println("Developer tool of abstract");	
}
public abstract void showTime();
{
System.out.println("showtime of abstract");	
}
public String getCompany() {
	return company;
}
public String getName() {
	return name;
}
public String getVersion()
{
	return version;
}
}

