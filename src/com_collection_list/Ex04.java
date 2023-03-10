package com_collection_list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> storedAItems = new ArrayList<Integer>();
		storedAItems.add(1);
		storedAItems.add(2);
		storedAItems.add(3);
		storedAItems.add(4);
		storedAItems.add(5);
		List<Integer> storeBItems = new ArrayList<Integer>();
		storeBItems.add(4);
		storeBItems.add(5);
		storeBItems.add(6);
		storeBItems.add(7);
		storeBItems.add(8);
		// addAll
		List<Integer> combinedStoreItems = new  ArrayList<Integer>();
		combinedStoreItems.addAll(storedAItems);
		combinedStoreItems.retainAll(storeBItems);
		printf(combinedStoreItems);
		
	}
	private static void printf(List<Integer> items) {
		for(Integer item: items) {
			System.out.println(item + " ");
		}
		System.out.println();
	}

}
