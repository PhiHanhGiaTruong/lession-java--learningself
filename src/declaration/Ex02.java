package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = {22, 44, 88, 66};
		System.out.println("digits length: " + digits.length);
		System.out.println("digits: " + Arrays.toString(digits));
		
		String[] sequences = {"Tom", "Smith", "Henry"};
		System.out.println("sequence: " + Arrays.toString(sequences));
		
		Item[] items = {
				new Item(1, "Item 1", 120, LocalDate.now()),
				new Item(2, "Item 2", 240, LocalDate.now().minusDays(1)),
				new Item(3, "Item 3", 180, LocalDate.now().plusDays(1))
		};
		System.out.println("items: " + Arrays.toString(items));
		Item[] mockItems = mockData();
		System.out.println("items: " + Arrays.toString(mockItems));
	}
	public static Item[] mockData() {
		Item[] items = {
				new Item(11, "Item 1", 120, LocalDate.now()),
				new Item(22, "Item 2", 240, LocalDate.now().minusDays(1)),
				new Item(33, "Item 3", 180, LocalDate.now().plusDays(1))
		};
		return items;
	}
	
}
