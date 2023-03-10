package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	private static final String DATE_PATTERN = "dd/MM/yyyy'T'hh:mm:ss a";
	public static void main(String[] args) {
		
		long current = System.currentTimeMillis();
		Date date = new Date();
		Calendar c = Calendar.getInstance();

		System.out.println("date: " + date);
		System.out.println("date: " + c);
		System.out.println("current: " + current);
		
		DateFormat df = new SimpleDateFormat(DATE_PATTERN);
		
		//Chuyển từ kiểu Calender sang kiểu Date rồi sang String
		String value = df.format(c.getTime());
		System.out.println("ddMMyyyy: " + value);
		// từ Date sang String
		 value = df.format(date);
		System.out.println("ddMMyyyy: " + value);
	}
}
