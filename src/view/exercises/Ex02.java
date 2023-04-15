package view.exercises;

import bean.Transaction;
import model.DataModel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
    //    2. Find all transactions
//    have value greater than 300 and sort them by trader’s city
    public static void main(String[] args) {
        List<Transaction> transactions = DataModel.getTransactions();
        List<Transaction> results =  transactions.stream()
                .filter(transaction -> transaction.getValue() > 300)
                .sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
                .collect(Collectors.toList());
        results.forEach(System.out::println);


    }
}
