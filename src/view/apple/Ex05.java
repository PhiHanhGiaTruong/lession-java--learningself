package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.functionPredicate;
import model.DataModel;
import utils.printf;

public class Ex05 {
//	Anonymous function = Lambda expression
	public static void main(String[] args) {
		List<Apple> invetory = DataModel.getAll();
		System.out.println("find all green apples in his inventory: ");
		List<Apple> greenApples = findApples(invetory, apple -> "green".equals(apple.getColor()));

		printf.print(greenApples);
		System.out.println("=================");
		System.out.println("find all red apples in his inventory: ");
		List<Apple> redApples = findApples(invetory, apple -> "red".equals(apple.getColor()));
		printf.print(redApples);
		System.out.println("=================");
		System.out.println("find all apples heaver than 150g: ");
		List<Apple> reavyApples = findApples(invetory, apple -> apple.getWeight() > 150);
		printf.print(reavyApples);
		System.out.println("=================");
		System.out.println("find all apples heavier lighter than 200g: ");
		List<Apple> LightApples = findApples(invetory, apple -> apple.getWeight() < 200);
		printf.print(LightApples);
		System.out.println("=================");
		System.out.println("find all apples that are green and heavier than 400g: ");
		List<Apple> applesByCAW = findApples(invetory,
				apple -> "red".equals(apple.getColor()) && apple.getWeight() > 400);
		printf.print(applesByCAW);
	}

	private static List<Apple> findApples(List<Apple> inventory, functionPredicate predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);

			}
		}
		return result;
	}
}
