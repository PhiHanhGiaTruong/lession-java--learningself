package view.exercises;

import bean.Trader;
import model.DataModel;

import java.util.List;
import java.util.stream.Collectors;

public class Ex06 {
//    6. Are any traders based in Milan?
    public static void main(String[] args) {
        List<Trader> traders = DataModel.getTraders();
        List<Trader> condition = traders.stream()
                .filter(trader -> trader.getCity().equals("Milan"))
                .collect(Collectors.toList());
        if (condition.isEmpty()){
            System.out.println("no contain");
        }else {
            System.out.println("yes contain");
        }
    }
}
