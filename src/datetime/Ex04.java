package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		int nos = getNoSundays(Calendar.FEBRUARY, 2012);
		System.out.println("nos: " + nos);
	}

	private static int getNoSundays(int moth, int year) {
		int nos = 0;
		Calendar dateStart = DateUtils.toCalendar(year, moth, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, moth, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Calendar c = dateStart;
		while (c.before(dateEnd)) {
			// kiểm tra điều kiện in ra ngày là chủ nhật
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			}
			nos++;
			c.add(Calendar.DAY_OF_MONTH, 7);
		}

		return nos;
	}
}
