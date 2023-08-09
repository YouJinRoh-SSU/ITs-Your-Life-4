package day_0725;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateExam {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getHours());//Deprecated 더 이상 사용되지 않음
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.DAY_OF_YEAR);
		int month = c.get(Calendar.DAY_OF_MONTH);
		int y = c.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(month);
		System.out.println(y);
		////////////
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일");
		String today = dateFormat.format(new Date());
		System.out.println(today);
	}

}
