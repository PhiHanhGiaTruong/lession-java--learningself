package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String greeting = "cheers out of my home";
		String[] words= greeting.split("\\s+");
		String line = "Le van hoang, 18, 14T4, 15/04/2002";
		String hobbies = "Game -  - Tennis  Badminton--------------Basketball";
		String text = "a2334djgl463dkl56kl";

		
		String[] properties = line.split(",\\s");
		String[] digits = text.split("[a-z]+");
		String[] game = hobbies.split("[\\s-]+");
		
		showText(game);
		showText(digits);
		showText(words);
		showText(properties);
		
	}
	private static void showText(String[] elements) {
		for (String element:elements) {
			System.out.println(element);
		}
		System.out.println("=============");
	}

}
