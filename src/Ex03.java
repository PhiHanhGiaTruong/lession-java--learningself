
public class Ex03 {
	/*
	 * Opt3: check condition and throw exception before calling function
	 */
	public static void main(String[] args) {
//bài toán a/b, trường họp exception là b=0;
		
			int a = 5;
			int b = 0;
			try {
				System.out.println("a/b= " + divide(a,b));
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("message " + e.getMessage());
			}
		System.out.println("back to main method");
	}
	private static int divide(int a, int b) {
		if(b == 0 ) {
			throw new ArithmeticException("--div by zeros");
		} 
	return a/b;
	}
}
