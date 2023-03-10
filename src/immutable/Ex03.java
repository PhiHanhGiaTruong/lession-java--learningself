package immutable;

import static utils.JvmUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Welcome";// H1
		String s2 = "Welcome";// H1
		
		System.out.println("=================Before===============");
		hash("s1 hash:", s1);
		hash("s2 hash:", s2);

		s1 = "Go out Home";
		System.out.println("=================After================");
		System.out.println("s1:" + s1);
		System.out.println("s2: " + s2);
		hash("s1 hash:", s1);
		hash("s2 hash:", s2);
	}

}
