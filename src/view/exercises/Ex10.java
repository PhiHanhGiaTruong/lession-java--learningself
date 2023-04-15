package view.exercises;

import bean.Transaction;
import model.DataModel;

import java.util.List;
import java.util.Objects;

public class Ex10 {
//10. Find the transaction with the smallest value.
    public static void main(String[] args) {
        List<Transaction> transactions = DataModel.getTransactions();
        Transaction result = transactions.stream()
                .filter(Objects::nonNull)
                .reduce(transactions.get(0), (initialValue, element) ->
                {
                    if (initialValue.getValue()> element.getValue()){
                        return element;
                    }
                    return initialValue;
                });
        System.out.println(result.getValue());

    }
}
