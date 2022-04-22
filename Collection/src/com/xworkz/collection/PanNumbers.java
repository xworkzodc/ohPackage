package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PanNumbers {
	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<>();
		collection.add("ABDTY1234D");
		collection.add("ABDTY4563D");
		collection.add("ABDTY5554D");
		collection.add("ABDTY43211D");
		collection.add("ABDTY5443D");
		collection.add("ABDTY6665D");
		collection.add("ABDTY45564D");
		int totalElements=collection.size();
		System.out.println("Total elements is----"+totalElements);
		Iterator<String> iterator=collection.iterator();
		String value=null;
		boolean yes=false;
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
	
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
		yes=iterator.hasNext();
		value=iterator.next();
		System.out.println(value);
		System.out.println(yes);
		
		 
		boolean present=collection.contains("ABDTY1234D");
		System.out.println("present value----"+present);
		
	}

}
