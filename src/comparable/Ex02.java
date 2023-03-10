package comparable;

public class Ex02 {
	public static void main(String[] args) {
		// Compare address .equals( : coding >> rarely use
				String s1 = "Hello";
				String s2 = "Machine";
				String s3 = "Hello";
				
				System.out.println("s1,s2" + (s1.equals(s2)));
				System.out.println("s1,s3" + (s1.equals(s3)));
				System.out.println("s2,s3" + (s2.equals(s3)));
				
				String o1 = "Hello";
				String o2 = "Machine";
				String o3 = "Hello";
				
				System.out.println("o1,o2" + (o1.equals(o2)));
				System.out.println("o1,o3" + (o1.equals(o3)));
				System.out.println("o2,o3" + (o2.equals(o3)));
		 		// Compare content: equals, compareTo
	}

}
