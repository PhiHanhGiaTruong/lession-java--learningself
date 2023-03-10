package com_collection_list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<Integer>();
		digits.add(10);
		digits.add(20);
		digits.add(40);
		for (Integer digit : digits) {
			System.out.println(digit*2);
		}
		System.out.println("\n=======================\n");
		List<String> students = new ArrayList<String>();
		students.add("Hoang Vu");
		students.add("The Chung");
		for(String student: students) {
			System.out.println(student);
		}

	}
}
