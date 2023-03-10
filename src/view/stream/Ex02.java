package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		List<Integer> result = inventory.stream()
				.filter(apple -> apple.getWeight() > 400)
				.map(apple -> apple.getId())
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
