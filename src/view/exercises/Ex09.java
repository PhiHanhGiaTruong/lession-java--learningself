package view.exercises;

import bean.Transaction;
import model.DataModel;

import java.util.List;
import java.util.Objects;

public class Ex09 {
//    9. What’s the highest value of all the transactions?
    public static void main(String[] args) {
        List<Transaction> transactions = DataModel.getTransactions();
        Transaction transactionMax = transactions.stream()
                .filter(Objects::nonNull)
                .reduce(transactions.get(0),(initialDish, element) -> {
                    if (initialDish.getValue() < element.getValue()){
                        return element;
                    }
                    return initialDish;
                });
        System.out.println(transactionMax.getValue());

    }
}
