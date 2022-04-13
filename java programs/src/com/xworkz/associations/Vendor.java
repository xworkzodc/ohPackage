package com.xworkz.associations;
import com.xworkz.associations.*;

public class Vendor extends Hotel {
	private VendorType vendorType;
	private double billPrice;
	private String name;
	//generate getter for all above proporties
	public Vendor(VendorType vendorType,double billPrice,String name)
	{
		this.billPrice=billPrice;
		this.name=name;
		this.vendorType=vendorType;
	}
	public boolean sell()
	{
		System.out.println("Invoked sell");
		if(this.billPrice>1000)
		{
			return true;
		}
		return false;
	}
	public double getBillPrice() {
		return billPrice;
	}
	public String getName()
	{
		return name;
	}
	public VendorType getVendorType()
	{
		return vendorType;
	}

}
