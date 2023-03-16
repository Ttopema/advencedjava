package api.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//출력되는 숫자와 날짜에 포맷을 적용할 수 있다.
// => 지정한 패턴에 맞게 출력
public class FormatTest {
	public static void main(String[] args) {
		//날짜출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal = Calendar.getInstance();
		//날짜객체에 SimleDateFormat에 정의한 패턴을 적용
		//SimpleDateFormat의 format메소드를 적용하면 패턴에 맞게 출력
		String data = sdf.format(cal.getTime());
		System.out.println(data);
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(12345));
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		System.out.println(df2.format(12345.1234));
		
		String decialdata = "123456.789";
		try {
			double num = (double)df2.parse(decialdata);
			System.out.println(df2.format(num));
		}
		catch(ParseException e){
			
		}
		
	}

}
