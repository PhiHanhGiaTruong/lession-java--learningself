import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		File file = new File("readme.md");
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		System.out.println("Back to MAIN method");
	}
	

}
