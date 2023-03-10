package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import bean.WeightType;
import model.DataModel;
import utils.printf;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> invetory = DataModel.getAll();
		System.out.println("find all green apples in his inventory: ");
		List<Apple> greenApples = findApplesByColor(invetory, "green");
		printf.print(greenApples);
		System.out.println("=================");
		System.out.println("find all red apples in his inventory: ");
		List<Apple> redApples = findApplesByColor(invetory, "red");
		printf.print(redApples);
		System.out.println("=================");
		System.out.println("find all apples heaver than 150g: ");
		List<Apple> reavyApples = findApplesByWeight(invetory, WeightType.HEAVY,150);
		printf.print(reavyApples);
		System.out.println("=================");
		System.out.println("find all apples heavier lighter than 200g: ");
		List<Apple> LightApples = findApplesByWeight(invetory, WeightType.LIGHT, 200);
		printf.print(LightApples);
		System.out.println("=================");
		System.out.println("find all apples that are green and heavier than 400g: ");
		List<Apple> applesByCAW = findApplesByCAW(invetory, "green", 400);
		printf.print(applesByCAW);

	}

	// 1. find all green apples in his inventory
	private static List<Apple> findApplesByColor(List<Apple> inventory, String requireColor) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (requireColor.equals(apple.getColor())) {
				result.add(apple);

			}
		}
		return result;
	}

	// 3. find all apples heaver than 150g
	// 4. find all apples heavier lighter than 200g
	private static List<Apple> findApplesByWeight(List<Apple> inventory, WeightType weightType, double requireWeight) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (WeightType.HEAVY.equals(weightType) && apple.getWeight() > requireWeight) {
				result.add(apple);

			} else if (WeightType.LIGHT.equals(weightType) && apple.getWeight() < requireWeight) {
				result.add(apple);
			}
		}
		return result;
	}

	// 5. find all apples that are green and heavier than 400g
	private static List<Apple> findApplesByCAW(List<Apple> inventory,String requireColor, double requireWeight) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (requireColor.equals(apple.getColor()) && apple.getWeight() < requireWeight) {
				result.add(apple);
			}
		}
		return result;
	}
}
