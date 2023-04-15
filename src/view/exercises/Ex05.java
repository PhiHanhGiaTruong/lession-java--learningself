package view.exercises;

import bean.Trader;
import model.DataModel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex05 {
//5. Return a string of all traders’ names
// sorted alphabetically.
    public static void main(String[] args) {
        List<Trader> traders = DataModel.getTraders();
         String results =  traders.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .collect(Collectors.joining(", "));
        System.out.println(results);
    }
}
