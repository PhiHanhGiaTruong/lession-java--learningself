package view.exercises;

import bean.Trader;
import model.DataModel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04 {
// 4. Find all traders from Cambridge
// and sort them by name desc.
    public static void main(String[] args) {
        List<Trader> traders = DataModel.getTraders();
        List<Trader> results = traders.stream()
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(trader -> trader.getName()))
                .collect(Collectors.toList());
        results.forEach(System.out::println);

    }
}
