package com.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		
		List  values = new ArrayList();
		values.add(4);
		values.add(10);
		values.add(11);
		values.add(2, 2); // this is for indexing, it will appear before 11 in output , 1st no. shows index and 2nd no. shows value. 
		
		Iterator it = values.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
