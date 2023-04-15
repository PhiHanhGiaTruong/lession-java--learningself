package view.exercises;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

import java.util.List;
import java.util.stream.Collectors;

public class Ex03 {
    //3. What are all the unique cities where the traders work?
    public static void main(String[] args) {
        List<Trader> traders = DataModel.getTraders();
        List<String> results =  traders.stream()
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        results.forEach(System.out::println);
    }
}
