import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	/*
	 * Input: nhập số năm sinh. Output: số tuổi B1: bài toán tìm số tuổi của một
	 * người khi biết năm sinh và số năm hiện tại. số tuổi bằng số năm hiện tại - số
	 * năm sinh. B2: kiểm tra điền kiện chuổi nhập vào có phải là một dãy số không.
	 * nếu khong phải thì thực hiện in ra dòng Cảnh báo.
	 */
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String yobsString = enterYear();
		int cry = Year.now().getValue();
		int yob = Integer.parseInt(yobsString);
		System.out.println("Age: " + (cry - yob));
	}
	private static String enterYear() {
		String yobsString = null;
	do {
		System.out.println("Enter year your birth: ");
		yobsString = ip.nextLine();
	} while (!yobsString.matches("\\d+"));
	return yobsString;
	}

	/*private static boolean isNumber(String sequence) {
		for (int index = 0; index < sequence.length(); index++) {
			char letter = sequence.charAt(index);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
*/
}
