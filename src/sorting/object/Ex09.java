package sorting.object;

import Utils.ArrayUtils;
import bean.Item;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex09 {
    public static void main(String[] args) {
        Item[] items = getItems();
//        Comparator<Item> comparator = (o1, o2) -> o1.getId() - o2.getId();
//        Function<Item,Integer> keyExtractor =Item::getId;
//        Comparator<Item> comparator =  Comparator.comparing(Item::getId).thenComparing(Item::getPrice);
        Arrays.sort(items, Comparator.comparing(Item::getId).thenComparing(Item::getPrice,Comparator.reverseOrder()));
        ArrayUtils.show(items);
    }

    private static Item[] getItems() {
        return new Item[]{
                new Item(3, "Cady ARD", 120, LocalDate.of(2021, 12, 3)),
                new Item(5, "Cake ARD", 20, LocalDate.of(2022, 11, 11)),
                new Item(1, "honey ARD", 320, LocalDate.of(2022, 2, 3)),
                new Item(9, "biscus ARD", 90, LocalDate.of(2021, 1, 3)),
                new Item(5, "bread ARD", 10, LocalDate.of(2021, 12, 5)),
        };

    }
}
