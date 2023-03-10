package com_collection_list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class Ex05 {
	private static Item item;
	static {
		item = new Item(1, 1, "Store 1 - Item 1", 120);
	}
	public static void main(String[] args) {
		List<Item> items = getItems();
		System.out.println("Is Exist ? " + items.contains(item));
		printf(items);
		System.out.println("===================");
		Ex01 ex01 = new Ex01();
        System.out.println("equals: " + item.equals(ex01));
		

	}

	private static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, 1, "Store 1 - Item 1", 120));
		items.add(new Item(1, 2, "Store 1 - Item 2", 123));
		items.add(new Item(1, 3, "Store 1 - Item 3", 125));
		items.add(new Item(2, 4, "Store 1 - Item 4", 126));
		items.add(new Item(2, 5, "Store 1 - Item 5", 127));
		items.add(new Item(3, 6, "Store 1 - Item 6", 121));
		items.add(new Item(3, 7, "Store 1 - Item 7", 129));
		items.add(new Item(3, 8, "Store 1 - Item 8", 124));
		return items;

	}
	private static void printf(List<Item> items) {
		for(Item item:items) {
			System.out.println(item);
		}
	}

}
