package view.exercises;

import bean.Trader;
import model.DataModel;

import java.util.List;
import java.util.TreeMap;

public class Ex07 {
    //    7. Count the number of traders in Milan.
    public static void main(String[] args) {
        List<Trader> traders = DataModel.getTraders();
        long countAll =  traders.stream()
                .filter(trader -> trader.getCity().equals("Milan"))
                .count();
        System.out.println(countAll);

    }
}
