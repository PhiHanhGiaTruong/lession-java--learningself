package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	/*
	 * LocalDate
	 * LocalDateTime
	 * DateTimeFormatter
	 */
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now()
				                  .withMonth(8)
				                  .withYear(2022);
		String formatted = df.format(date);
		
		System.out.println("date: " + date);
		System.out.println("formatted" + formatted);
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		Period period =  Period.between(date,  anotherDate);
		System.out.println("period: " + period);
		System.out.println(period.getYears() + "year\n" +
		                   period.getMonths() +  "months\n" + 
		                   period.getDays() + "days\n");
		
	
		
		// Thiết lập thời gian hiện tại
		
		
	}

}
