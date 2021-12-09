package com.technoelevate.practiceprograms;

import java.util.Iterator;

public class ownMain {
	public static void main(String[] args) {
		OwnArray oa = new OwnArray(2);
		oa.addElements("ashok");
		oa.addElements("shiva");
		oa.addElements("naveen");
		System.out.println(oa.getElements(1));
		Iterator itr = oa.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
