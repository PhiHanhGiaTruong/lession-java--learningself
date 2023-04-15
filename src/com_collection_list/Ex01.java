package com_collection_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex01 {
	public static void main(String[] args) {
		// raw type
		ArrayList salary = new ArrayList();
		salary.add(new Integer(20));
		salary.add(new Integer(30));
		salary.add("10 trieu");
		// compile time >> no error
		// runtime  >> java.lang.NumberFormatException: For input string: "10 trieu"
		// for each; JDK 1.5
		System.out.println(salary);
		LinkedList listB = new LinkedList();
		
		
		System.out.println(listB);
	}

}
