package com.xworkz.associations;
import com.xworkz.associations.*;
public class HotelRunner {
	public static void main(String[] args)
	{
		String vendorName="Manju Vegetable Vendor";
		Vendor vendor=new Vendor(VendorType.VEGETABLE,2000,vendorName);
		Hotel hotel=new Hotel(vendor);
		hotel.buyVegetables();
	}

}
