import java.util.Random;

import self.InvalidAgeException;

public class Ex06 {
	private static Random rd = new Random();
	public static void main(String[] args) throws InvalidAgeException {
		String ticket = bookTicket(null, 16+ rd.nextInt(5));
		System.out.println(ticket);
	}
	private static String bookTicket(String name, int Age) throws InvalidAgeException {
		if(name ==null) {
			throw new NullPointerException("Name cann't be null");
		}
		if(Age<18) {
			throw new InvalidAgeException("Invalid Age (>=18)");
		}
		return "tk123";
	}
}
