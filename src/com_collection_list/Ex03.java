package com_collection_list;

import java.io.ObjectInputFilter.Status;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	/*
	 * Basic operation SOT: construct, add, set, iterate, for each, size, remove,
	 * contains internal build Date structure: Array
	 */
	public static void main(String[] args) {
		List<String> stated = new ArrayList<>(20);
		// Hàm thêm một giá trị vao mảng list
		stated.add("Order");
		stated.add("Package");
		stated.add("Delivery");
		// Hàm thiết lập giá trị.
		stated.set(2, "BOM");
		// Hàm lấy một phần tử ra
		System.out.println("size: " + stated.size());
		System.out.println("stated[1]: " + stated.get(1));
		for (String state : stated) {
			System.out.println(state);

		}
		System.out.println("\n\\\\\\\\\\\\\\================\\\\\\\\\\\\n");
		Iterator<String> iterator = stated.iterator();
		while (iterator.hasNext()) {
			String status = iterator.next();
			System.out.println("iterator: " + status);
		}
		String word = "BOOM";
		for (String status : stated) {
			if (word.equals(status)) {
				System.out.println("is existed ?" + word);

			}

		}
		// stated.remove(0);
		// stated.remove(BOOM);
//		stated.removeIf(t -> t.length() < 6);
		stated.removeIf(t -> t.startsWith("B"));
		for (String state : stated) {
			System.out.println(state);

		}
	}
}
