package model;

import java.util.Arrays;
import java.util.List;

import bean.Apple;
import bean.Dish;
import bean.Dish.Kind;

public class DataModel {
	private DataModel() {
		
	}
	public static List<Apple> getApples(){
		return Arrays.asList(
				new Apple(1, "green", 200, "VietNam"),
				new Apple(16, "green", 300, "TrungQuoc"),
				new Apple(22, "red", 300, "ThaiLan"),
				new Apple(4, "yellow", 400, "Lao"),
				new Apple(17, "red", 600, "VietNam"),
				new Apple(6, "green", 100, "VietNam")
				);
	}
	 public static List<Dish> getDishes () {
		 return Arrays.asList(new Dish ("1", "D1", 308, Kind. FISH, false),
		                      new Dish ("2", "D2", 620, Kind.OTHER, true),
		                      new Dish ("2", "D2", 620, Kind.OTHER, true),
		                      new Dish ("3","D3", 329, Kind. OTHER, true),
		                      new Dish ("4","D4", 308, Kind.MEAT, false),
		                      new Dish ("5", "D5", 480,Kind. MEAT, false),
		                      new Dish ("4","D4", 308, Kind.MEAT, false),
		                      new Dish ("5", "D5", 480,Kind. MEAT, false),
		                      new Dish ("6", "D6", 480, Kind. FISH, false),
		                      new Dish ("7", "D7", 818, Kind.MEAT, false));
		 
		 }

}
