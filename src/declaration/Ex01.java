package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		//initial arrays without with size
		int[] digits = new int[6];
		System.out.println(Arrays.toString(digits));
		System.out.println(digits);
		// kiểm tra xem digits có phải là một đối tượng hay không.
		// bằng cách kiểm tra xem có sự thay đổi giá trị không.
		// nếu là biến nguyên thủy thì nó sẽ không cập nhật.
		digits[2] = 22 ;
		//digits[6] = 66 ; array index out of bound exception
		modify(digits);
		System.out.println(Arrays.toString(digits));
		System.out.println("\n =======\\\\\\=============");
		// initial arrays with values
		String[] sequences = new String[4];
		sequences[0] = "Empty";
		boolean startWithSgk =  (sequences[1] != null && sequences[1].startsWith("SGK"));
		System.out.println("start with SGK: " + startWithSgk);	
		System.out.println("\n =======\\\\\\=============");
		Item[] item = new Item[8];
		item[0] = new Item(123, "Item 123", 220,LocalDate.now());
		System.out.println(Arrays.toString(item));
		System.out.println(Arrays.toString(item));
	}
	private static void modify(int[] input) {
		input[0] = 99;
	}

}
