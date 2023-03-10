package immutable;

public class Ex04 {
/*
 * 
 * 1. Tính chiều dài của chuổi s
 * 2. Nối chuỗi s1 vào chuỗi s
 * 3. Lấy một ký tự tại vị trí index trong chuổi s
 * 4. duyệt từng phần tử trong chuỗi.
 * 5.Tìm vị trí xuất hiện đầu tiên, cuối cùng của kí tự(a) trong chuỗi s
 */
	public static void main(String[] args) {
		String s = "Brid";
		String s1 = " Layoud";
		//Tính chiều dài của chuổi s
		System.out.println("length: " + s1.length());
//		Nối chuỗi s1 vào chuỗi s
		s = s.concat(s1);// s = s +s1;
		System.out.println("s concat: " + s);
//		Lấy một ký tự tại vị trí index(3) trong chuổi s
		System.out.println("value at index 3:" + s.charAt(3));
//		duyệt từng phần tử trong chuỗi.
		for(int i = 0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
//		Tìm vị trí xuất hiện đầu tiên, cuối cùng của kí tự(a) trong chuỗi s
		System.out.println(" First 'd' position: " + s.indexOf("d"));
		System.out.println(" Last 'd' position: " + s.lastIndexOf("d"));
	}

}
