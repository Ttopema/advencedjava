package api.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal2);
		
		Date d = new Date();
		System.out.println(d);
		System.out.println("==================Calendar객체의 사용방법==================");
		System.out.print(cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH)+1) + "월" + cal.get(Calendar.DATE) + "일" + cal.get(Calendar.HOUR) + "시" + cal.get(Calendar.MINUTE) + "분" + cal.get(Calendar.SECOND) + "초\n");
		
		cal2.set(2013,8, 1);
		System.out.println(cal2);
		System.out.println(cal.getTimeInMillis()); // 날짜 시간객체의 값을 millisecond반환
		
		
		//오늘부터 6월 18일까지 d-day를 계산해보기
		//d-day를 담을 객체, 현재 날짜를 담을 객체?
		
		Calendar dday = new GregorianCalendar();
		Calendar today = new GregorianCalendar();
		
		dday.set(2023, 5, 18);
		System.out.println(dday);
		long time = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(time/1000/60/60/24);
	
	}
}
