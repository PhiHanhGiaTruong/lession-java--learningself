package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, Calendar.FEBRUARY, 22, 19, 15,0);

		Calendar now = Calendar.getInstance();
		long starInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();

		long duration = nowInMs - starInMs;
		// long days = duration/1000/60/60/24;
		// Dùng thư viện đổi từ milis sang ngày.
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("days: " + days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);

		String result = days + "days\n" + hours + "hours\n" + minutes + "minutes\n" + seconds + "seconds\n";
		System.out.println("result: " + result);

	}

}
