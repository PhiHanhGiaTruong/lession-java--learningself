package sort.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import utils.ArrayUtils;

public class Ex09 {
	public static void main(String[] args) {
		Item[] items = getItems();
//		Required: Comparable<Item>

//		ArrayUtils.show(items);
//		C1 >> anonymous class >> hard issues
//		Comparator<Item> comparator = (o1, o2) -> o1.getId() - o2.getId();
//		Arrays.sort(items, comparator);
//		C2 >> Comparator.comparing
//		Function<Item, Integer> keyExtractor = new Function<Item, Integer>() {
//			@Override
//			public Integer apply(Item item) {
//				return item.getId();
//			}
//		};
		
//		C3 >> Comparator.comparing >> lambda
//		Function<Item, Integer> keyExtractor1 = (Item item) -> item.getId();
//		C4 >> Comparator.comparing >> lambda >> method reference in Java08
//		Function<Item, Integer> keyExtractor = Item::getId
//		Comparator<Item> comparator = Comparator.comparing(Item::getId);
//		Required: Price ASC, ID DESC
//		Comparator<Item> comparator = Comparator.comparing(Item::getId).thenComparing(Item::getId,Comparator.reverseOrder());
		Arrays.sort(items, Comparator.comparing(Item::getId).thenComparing(Item::getId,Comparator.reverseOrder()));
		ArrayUtils.show(items);
	}
	private static Item[] getItems() {
		return new Item[] { new Item(3, "Cady ARD", 120, LocalDate.of(2021, 12, 3)),
				new Item(5, "Cake ARD", 20, LocalDate.of(2022, 11, 11)),
				new Item(1, "honey ARD", 320, LocalDate.of(2022, 2, 3)),
				new Item(9, "biscus ARD", 90, LocalDate.of(2021, 1, 3)),
				new Item(5, "bread ARD", 10, LocalDate.of(2021, 12, 5)), };
	}

}
