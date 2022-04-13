package com.xworkz.associations;

public class Hotel {
	//cons,set,literals
	private String name=new String("a2b");//literal
	private int since;//setter
	//generate getter for above properties
	public enum VendorType{
		VEGETABLE,GROCERY,WATER,MILK
	}
	private Vendor vendor;//CONST
public Hotel(Vendor vendor)
{
	this.vendor=vendor;//ref vendor
}
public void buyVegetables() {
	System.out.println("invoked vegetables");
	if(this.name!=null)
	{
		String hotelName=this.name.toUpperCase();
		System.out.println(hotelName);
	}
	if(vendor!=null)
	{
		boolean sold=this.vendor.sell();
		if(sold)
		{
			System.out.println("Hotel bought vegetables");
			System.out.println(this.vendor.getBillPrice());
			System.out.println(this.vendor.getName());
			System.out.println(this.vendor.getVendorType());
			}else {
				System.out.println("Hotel dont have vegetables");
			}
	}
}
public void setSince(int since) {
	this.since=since;
}
public void setName(String name)
{
	this.name=name;
}
}
