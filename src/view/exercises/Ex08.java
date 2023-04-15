package view.exercises;

import bean.Transaction;
import model.DataModel;

import java.util.List;
import java.util.stream.Collectors;

public class Ex08 {
    //    8. Print all transactions’ values
//    from the traders living in Cambridge.
    public static void main(String[] args) {
        List<Transaction> transactions = DataModel.getTransactions();
        List<Integer> results = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        results.forEach(System.out::println);

    }
}
