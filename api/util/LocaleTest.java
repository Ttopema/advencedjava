package api.util;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

//Locale은 각 지역의 국가 언어 정보를 가지고 있는 객체
public class LocaleTest {
	public static void main(String[] args) {
		Locale[] locale = Locale.getAvailableLocales();
		for (int i = 0; i < locale.length; i++) {
			System.out.println(locale[i]);
		}
		Locale.Builder builder = new Locale.Builder();
		builder = builder.setLanguage("en");
		builder = builder.setRegion("US");
		Locale locale2 = builder.build();
		
		Locale locale3 = new Locale.Builder().setLanguage("en").setRegion("US").build(); 
		
		//locale2 == locale3가 같음
		
		Calendar cal = Calendar.getInstance(locale3);
//		TimeZone.getTimeZone(cal);
	}
}
