package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.functionPredicate;
import model.DataModel;
import utils.printf;

public class Ex04 {
//	Anonymous class
	public static void main(String[] args) {
		List<Apple> invetory = DataModel.getAll();
		System.out.println("find all green apples in his inventory: ");
		List<Apple> greenApples = findApples(invetory, new functionPredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		printf.print(greenApples);
		System.out.println("=================");
		System.out.println("find all red apples in his inventory: ");
		List<Apple> redApples = findApples(invetory, new functionPredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "red".equals(apple.getColor());
			}
		});
		printf.print(redApples);
		System.out.println("=================");
		System.out.println("find all apples heaver than 150g: ");
		List<Apple> reavyApples = findApples(invetory, new functionPredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() > 150;
			}
		});
		printf.print(reavyApples);
		System.out.println("=================");
		System.out.println("find all apples heavier lighter than 200g: ");
		List<Apple> LightApples = findApples(invetory, new functionPredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() < 200;
			}
		});
		printf.print(LightApples);
		System.out.println("=================");
		System.out.println("find all apples that are green and heavier than 400g: ");
		List<Apple> applesByCAW = findApples(invetory, new functionPredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "red".equals(apple.getColor()) && apple.getWeight()> 400;
			}
		});
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

	// 1. find all green apples in his inventory
	// 3. find all apples heaver than 150g
	// 4. find all apples heavier lighter than 200g	
	// 5. find all apples that are green and heavier than 400g

}
