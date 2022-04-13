package com.xworkz.overrid;

public class Tyre {
	String companyname;
	int price;
	String ModelNo;
	String Available;

	public Tyre(String companyname, int price, String ModelNo, String Available) {
		super();
		System.out.println("this is parameterized constraction");
		this.companyname = companyname;
		System.out.println(companyname);
		this.price = price;
		System.out.println(price);
		this.ModelNo = ModelNo;
		System.out.println(ModelNo);
		this.Available = Available;
		System.out.println(Available);
	}

	public int hashCode() {
		int superHashCode = super.hashCode();
		System.out.println("hashcode from parent=" + superHashCode);
		return 100;
	}

	public String toString() {
		return "Tyre";
	}

}
