package com_collection_map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new LinkedHashMap<>();
		model.put(92, "quang nam");
		model.put(74, "da nang");
		model.put(75, "thua thien hue");
		model.put(73, "quang tri");
		print(model);
		sort(model);
		putSort(model);
	}

	private static Map<Integer, String> sort(Map<Integer, String> model) {
		Map<Integer, String> sortMap = new HashMap<>();
		Set<Entry<Integer, String>> elements = model.entrySet();
		List<Entry<Integer, String>> sortList = new ArrayList<>(elements);
		sortList.sort(new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		return sortMap;
	}

//	Put elements form sortedList to sortMap
	private static Map<Integer, String> putSort(Map<Integer, String> model) {
		Map<Integer, String> sortMap = new HashMap<>();
		Set<Entry<Integer, String>> elements = model.entrySet();
		List<Entry<Integer, String>> sortList = new ArrayList<>(elements);
		for (Entry<Integer, String> entry : sortList) {
			sortMap.put(entry.getKey(), entry.getValue());

		}
		return sortMap;
	}

	private static void print(Map<Integer, String> model) {
		Set<java.util.Map.Entry<Integer, String>> entries = model.entrySet();
		for (java.util.Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "...." + entry.getValue());
		}
	}

}
