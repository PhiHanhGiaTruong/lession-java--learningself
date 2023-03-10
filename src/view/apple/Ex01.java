package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import model.DataModel;
import utils.printf;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> invetory = DataModel.getAll();
		System.out.println("find all green apples in his inventory: ");
		List<Apple> greenApples = findGreenApples(invetory);
		printf.print(greenApples);
		System.out.println("=================");
		System.out.println("find all red apples in his inventory: ");
		List<Apple> redApples = findRedApples(invetory);
		printf.print(redApples);
		System.out.println("=================");
		System.out.println("find all apples heaver than 150g: ");
		List<Apple> reavyApples = findHeavyApples(invetory);
		printf.print(reavyApples);
		System.out.println("=================");
		System.out.println("find all apples heavier lighter than 200g: ");
		List<Apple> LightApples = findLightApples(invetory);
		printf.print(LightApples);
		System.out.println("=================");
		System.out.println("find all apples that are green and heavier than 400g: ");
		List<Apple> applesByCAW = findApplesByCAW(invetory);
		printf.print(applesByCAW);
		
		

	}

	// 1. find all green apples in his inventory
	private static List<Apple> findGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) {
				result.add(apple);

			}
		}
		return result;
	}

	// 2. find all red apples in his inventory
	private static List<Apple> findRedApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("red".equals(apple.getColor())) {
				result.add(apple);

			}
		}
		return result;
	}

	// 3. find all apples heaver than 150g
	private static List<Apple> findHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > 150) {
				result.add(apple);

			}
		}
		return result;
	}

	// 4. find all apples heavier lighter than 200g
	private static List<Apple> findLightApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() < 200) {
				result.add(apple);

			}
		}
		return result;
	}

	// 5. find all apples that are green and heavier than 400g
	private static List<Apple> findApplesByCAW(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor()) && apple.getWeight() < 200) {
				result.add(apple);
			}
		}
		return result;
	}
}
