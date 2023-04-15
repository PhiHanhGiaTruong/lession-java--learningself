package baiTapArray;

import Utils.ArrayUtils;
import bean.Item;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class practise {
    public static void main(String[] args) {
        Item[] items = getItems();
        Arrays.sort(items, Comparator.comparing(Item::getId).thenComparing(Item::getExpiredDate));
        ArrayUtils.show(items);
    }

    private static Item[] getItems() {
        return new Item[]{
                new Item(3, "Candy ARD", 120, LocalDate.of(2021, 1, 3)),
                new Item(1, "Candy ARD", 90, LocalDate.of(2010, 2, 4)),
                new Item(6, "Candy ARD", 130, LocalDate.of(2012, 5, 8)),
                new Item(8, "Candy ARD", 10, LocalDate.of(2007, 4, 9)),
                new Item(2, "Candy ARD", 135, LocalDate.of(2032, 2, 1)),
                new Item(9, "Candy ARD", 80, LocalDate.of(2003, 9, 8))
        };
    }

}