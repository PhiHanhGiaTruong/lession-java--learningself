import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_throws {
	public static void main(String[] args) throws IOException {
		File file = createNewFile("readme.md");
		boolean isSuccess = write(file);
		System.out.println("isSuccess: " + isSuccess);
		System.out.println("Back to MAIN method");
	}
	
	private static boolean write(File file) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			write(fw, "Lession06 - Exception\n");
			write(fw, "Lession06 - Exception\n");
			write(fw, "Lession06 - Exception\n");
			write(fw, "" + 5/0);
			write(fw, "Lession06 - Exception\n");
			write(fw, "Lession06 - Exception\n");
			write(fw, "Lession06 - Exception\n");
			write(fw, "Lession06 - Exception\n");
			
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return true;
	}
	
	private static void write(FileWriter fw, String line) throws IOException{
		fw.write(line + "\n");
	}
	
	private static File createNewFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				isSuccess = file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}
 
}
