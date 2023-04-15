import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
//		int[] a = null;
		int[] a = new int[2];
		test(a);
		System.out.println(Arrays.toString(a));
	}
	private static void test(int[] a) {
		a[0] =5;
		a[1] = 10;
	}

}
