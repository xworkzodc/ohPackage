package com.xworkz.overrid;

import com.xworkz.overrid.*;

public class TyreRunner {
	public static void main(String[] args) {
		Tyre tyre = new Tyre("CEAT", 1500, "KTM_Duke_200", "110/70_R17");
		System.out.println(tyre.hashCode());
		System.out.println(tyre);
		Tyre tyre2 = new Tyre("Dunlop", 1000, "KTM_RC_200", "110/70_R17");
		System.out.println(tyre2.hashCode());
		System.out.println(tyre2);
		boolean equal = tyre.equals(tyre2);
		System.out.println("Equals=" + equal);
	}
}
