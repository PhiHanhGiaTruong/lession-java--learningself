package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123";
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "   welcome to   out class    ";
		// kiem tra ki tu, chuoi bat dau, ket thuc trong chuoi s co phai la s1 khong
		System.out.println("start with STK: " + s.startsWith(s1));
		System.out.println("end with STK: " + s.endsWith(s1));
		// thay the chuoi s1 bang chuoi s2 trong chuoi s
		System.out.println("after replace: " + s.replace(s1, s2));
		System.out.println("after replace: " + s);
		// loai bo khoang trang 2 dau
		System.out.println("remove redundant spaces: " + s3.trim().replaceAll("\\s+", " "));
        // tao mot chuoi s4 tu chuoi s tu vi tri so 2.
		String s4 = s.substring(4);
		System.out.println("s4: " + s4);
		String s5 =s.substring(0, 4);
		System.out.println("s5: " + s5);
		//Tim kiem chuoi A co ton tai trong chuoi B khong
		System.out.println("s contains s2:" + s.contains(s2));
		
	}

}
