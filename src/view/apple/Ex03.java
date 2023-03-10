package view.apple;

import java.util.ArrayList;
// use implementation class
import java.util.List;

import bean.Apple;
import functional.GreenApplePredicate;
import functional.HeavyWeightApplePredicate;
import functional.LightWeightApplePredicate;
import functional.RedApplePredicate;
import functional.WeightAndColorApplePredicate;
import functional.functionPredicate;
import model.DataModel;
import utils.printf;

public class Ex03 {
	public static void main(String[] args) {
		List<Apple> invetory = DataModel.getAll();
		System.out.println("find all green apples in his inventory: ");
		List<Apple> greenApples = findApples(invetory, new GreenApplePredicate());
		printf.print(greenApples);
		System.out.println("=================");
		System.out.println("find all red apples in his inventory: ");
		List<Apple> redApples = findApples(invetory, new RedApplePredicate());
		printf.print(redApples);
		System.out.println("=================");
		System.out.println("find all apples heaver than 150g: ");
		List<Apple> reavyApples = findApples(invetory, new HeavyWeightApplePredicate());
		printf.print(reavyApples);
		System.out.println("=================");
		System.out.println("find all apples heavier lighter than 200g: ");
		List<Apple> LightApples = findApples(invetory, new LightWeightApplePredicate());
		printf.print(LightApples);
		System.out.println("=================");
		System.out.println("find all apples that are green and heavier than 400g: ");
		List<Apple> applesByCAW = findApples(invetory, new WeightAndColorApplePredicate());
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
