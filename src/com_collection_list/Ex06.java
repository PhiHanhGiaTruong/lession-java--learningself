package com_collection_list;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;

import java.util.List;

import bean.Item;
import model.Dataprovider;

public class Ex06 {
	/*
	 * sorting with Collection#List
	 * sort(List<T>): T implement Comparable<T>
	 */
	public static void main(String[] args) {
		List<Item> items  = Dataprovider.getItems();
//		Collections.sort(items,comparing(Item::getPrice).reversed());
//		sort(items,comparing(Item::getPrice));
		items.sort(comparing(Item::getStoreId)
		     .thenComparing(Item::getItemId, reverseOrder()));
		Dataprovider.printf(items);
	}
	
	}


