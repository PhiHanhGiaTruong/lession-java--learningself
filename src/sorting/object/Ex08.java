package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;

import Utils.ArrayUtils;
import bean.Item;


public class Ex08 {
    public static void main(String[] args) {
//		Restricted of Comparable

        Item[] items = getItems();
        Arrays.sort(items);
        ArrayUtils.show(items);

    }
    private static Item[] getItems() {
        return new Item[] {
                new Item(3, "Cady ARD", 120, LocalDate.of(2021, 12, 3)),
                new Item(5, "Cake ARD", 20, LocalDate.of(2022, 11, 11)),
                new Item(1, "honey ARD", 320, LocalDate.of(2022, 2, 3)),
                new Item(9, "biscus ARD", 90, LocalDate.of(2021, 1, 3)),
                new Item(5, "bread ARD", 10, LocalDate.of(2021, 12, 5)),
        };
    }

}

