package com_collection_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02 {
	/*
	 * Map Iterator
	 */
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "quang nam");
		model.put(74, "da nang");
		model.put(75, "thua thien hue");
		model.put(73, "quang tri");
		System.out.println("size: " + model.size());
		System.out.println("=======================");

//		1. Iterate via keys
//		nó không đảm bảo theo thứ tự.
		loopByKeys(model);
		System.out.println("=======================");
//		2. Iterate via values
		loopByValues(model);
		System.out.println("=======================");
//		3. Iterate via entries(key&value)
		loopByEntries(model);

	}

	private static void loopByKeys(Map<Integer, String> model) {
//		đưa các key thành các phần tử của Set
		Set<Integer> keys = model.keySet();
		for (Integer key : keys) {
			System.out.println(key + ", " + model.get(key));
		}
	}

	private static void loopByValues(Map<Integer, String> model) {
//		đưa các key thành các phần tử của Collection
		Collection<String> values = model.values();
		for (String value : values) {
			System.out.println(value);
		}
	}

	private static void loopByEntries(Map<Integer, String> model) {
		Set<java.util.Map.Entry<Integer, String>> entries = model.entrySet();
		for(java.util.Map.Entry<Integer, String> entry:entries) {
			System.out.println(entry);
		}
			
			
			

	}

}
