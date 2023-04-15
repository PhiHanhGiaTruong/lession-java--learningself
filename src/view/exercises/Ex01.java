package view.exercises;

import bean.Transaction;
import model.DataModel;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    //    Find all transactions
//    in the year 2011 and sort them by value (small to high).
    public static void main(String[] args) {
//    in transactions: save transactions on List.
        List<Transaction> transactions = DataModel.getTransactions();
//        in 2011: use filter transaction with condition: in 2011
         List<Transaction> results =  transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
//        sort small to high
                .sorted(Comparator.comparing(transaction -> transaction.getValue()))
                .collect(Collectors.toList());
         results.forEach(System.out::println);
        System.out.println("==============");
        List<Transaction> results1 =  transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                //        sort high to small
                .sorted(Comparator.comparing(transaction -> transaction.getValue(), Comparator.reverseOrder()))
                .collect(Collectors.toList());
        results1.forEach(System.out::println);
    }
}
