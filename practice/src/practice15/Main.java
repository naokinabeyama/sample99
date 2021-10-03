package practice15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < 100; i++) {
//			sb.append(i+1) .append(",");
//		}
//		String s = sb.toString();
//		String[] a = s.split(",");

//		Date now = new Date();
//		Calendar c = Calendar.getInstance();
//		c.setTime(now);
//
//		int day = c.get(Calendar.DAY_OF_MONTH);
//		day += 100;
//		c.set(Calendar.DAY_OF_MONTH, day);
//
//		Date future = c.getTime();
//
//		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
//		System.out.println(f.format(future));

		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
	}
}
