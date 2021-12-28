package ex47;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex47 {

	public static void main(String args[]) {
		SimpleDateFormat dayMonthYear = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		dayMonthYear.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

		System.out.println("\nNow: " + dayMonthYear.format(System.currentTimeMillis()));

	}
}