
public class App extends Devide{

	public App(Integer number) throws ArithmeticException {
		super(number);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		try {
			App app = new App(0);
			
			int a = 10;
			int b = app.getNumber();
			
			System.out.println(a / b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
