package com_collection_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Ex03 {
	/*
	 * HashMap: do not contains in the oder 
	 * LinkedHashMap: do contains in the order
	 * TreeMap: do contains in the order ESC
	 */
	public static void main(String[] args) {
		Map<Integer, String> model = new LinkedHashMap<>();
		model.put(92, "quang nam");
		model.put(74, "da nang");
		model.put(75, "thua thien hue");
		model.put(73, "quang tri");
		print(model);
	}

	private static void print(Map<Integer, String> model) {
		Set<java.util.Map.Entry<Integer, String>> entries = model.entrySet();
		for (java.util.Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "...." + entry.getValue());
		}
	}

}
