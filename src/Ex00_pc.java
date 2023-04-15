import java.time.Year;
import java.util.Scanner;

public class Ex00_pc {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter year your birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		int cry = Year.now().getValue();
		System.out.println("Age: " +(cry - yob));
	}
}
