package com.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListWithForloop {

public static void main(String[] args) {

		
		List  values = new ArrayList();
		values.add(4);// it has zero index if it is not mentioned.
		values.add(10);
		values.add(11);
		values.add(1, 2); // this is for indexing, it will appear before 11 in output , 1st no. shows index and 2nd no. shows value. 
		
		for(int i=0;i<values.size();i++)
			
			System.out.println(values.get(i));
		}

	}


