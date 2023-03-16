package api.util;

import java.util.Calendar;

public class CalendarTest2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); 
		System.out.println(cal.get(Calendar.AM)); //지우기
		System.out.println(cal.get(Calendar.PM)); //지우기
		System.out.println(cal.get(Calendar.AM_PM)); //현재시간을 기준으로 오전인지 오후인지에 대한 결과를 나타낸다.
		if(cal.get(Calendar.AM_PM) == Calendar.PM) {
			System.out.println("오후");
		}
		else {
			System.out.println("오전");
		}
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 지우기 // 요일 index는 1부터 시작
		System.out.println(cal.get(Calendar.SUNDAY)); //지우기
		System.out.println(cal.get(Calendar.WEDNESDAY)); //지우기
		System.out.println(cal.get(Calendar.SATURDAY));//지우기
	}
}
