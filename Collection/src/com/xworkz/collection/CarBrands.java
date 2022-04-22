package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CarBrands {
	

	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<>();
		collection.add("Ford");
		collection.add("Tata");
		collection.add("Toyota");
		collection.add("Renoult");
		collection.add("Honda");
		collection.add("Maruthi");
		collection.add("Skoda");
		int totalElements=collection.size();
		System.out.println("Total elements is----"+totalElements);
		
		boolean present=collection.contains("Maruthi");
		System.out.println("present value----"+present);
		
		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext())
		{
			String value=iterator.next();
			System.out.println(value);
		}
	}

}
