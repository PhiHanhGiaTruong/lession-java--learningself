package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01 {
public static void main(String[] args) {
	//
	Calendar c = Calendar.getInstance(Locale.FRANCE);
	// set ngày theo mong muốn 
	//c.set(Calendar.DAY_OF_MONTH, 20);
	//c.set(Calendar.YEAR, 2024);
	System.out.println(c);
	
	int day = c.get(Calendar.DAY_OF_MONTH);
	int moth = c.get(Calendar.MONTH)+1;
	int year = c.get(Calendar.YEAR);
	
	System.out.println("DMY: " + day + "/" + moth+ "/" + year);
	int hour = c.get(Calendar.HOUR);
	int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
	int minute = c.get(Calendar.MINUTE);
	int second = c.get(Calendar.SECOND);
	String ap = c.get(Calendar.AM_PM)==1 ? "PM" : "AM";
	
	System.out.println("H12MS: " + (hour + ":"+ minute + ":" + second + " "+ap));
	System.out.println("H12MS: " + (hourOfDay + ":"+ minute + ":" + second ));
	
	int dow = c.get(Calendar.DAY_OF_WEEK);
	String[] dayOfWeeks = {"Sunday"," Monday", "Tuesday","Wednesday","Thursday", "Friday","Saturday"};
	//index: 0-6
	//dow: 1-7
	//Cách 1
	String dayOfWeekAsString = dayOfWeeks[dow-1];
	System.out.println("dayOfWeekAsString: " + dayOfWeekAsString);
	//cách 2
	DayOfWeek[] dowEnum = DayOfWeek.values();
	System.out.println("DayOfWeekEnum: " + dowEnum[dow -1]);
	
	int weekOfMoth = c.get(Calendar.WEEK_OF_MONTH);
	int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
	System.out.println("weekOfMoth: " + weekOfMoth);
	System.out.println("weekOfYear: " + weekOfYear);
	
	System.out.println("default: " + Locale.getDefault());
	System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
	
	//Task: input = today
    //      output = first weekday 
	Calendar firstDayofWeek = Calendar.getInstance();
	firstDayofWeek.setTimeInMillis(c.getTimeInMillis());
	firstDayofWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()- c.get(Calendar.DAY_OF_WEEK));
	System.out.println("first day of week: " + firstDayofWeek);
	// hàm kiểm tra có phải năm nhuận không.
	GregorianCalendar calendar = new GregorianCalendar();
	System.out.println("isLeapYear: " + calendar.isLeapYear(2024));
	//1 - Sunday
	//2 - Monday
	//3- Tuesday 
	//4 - Wednesday
	//5-Thursday
	//6-Friday
	//7-Saturday
	System.out.println("=================================");
	Date date = new Date();
	System.out.println("date: " + date);
	
	System.out.println("hours: " + date.getHours());
	
	
}
}
