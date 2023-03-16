package api.util;

import java.util.Calendar;
import java.util.Locale;

//사용 언어별로 ㅏ른 리소스를 
public class LocaleTest2 {
	public static void main(String[] args) {
		Locale locale = new Locale.Builder()
				.setLanguage("en")
				.setRegion("US")
				.build();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		
		Locale locale2 = new Locale.Builder()
				.setLanguage("ko")
				.setRegion("KR")
				.build();
		System.out.println(locale2.getLanguage());
		System.out.println(locale2.getCountry());
		//언어ㅓ와 국가 설정내용을 기본 설정된 로케일에 맞춰서 출력한다.
		// => 기본설정된 로케일 정보가 한국
		System.out.println(locale.getDisplayName(Locale.CHINESE));
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale2.getDisplayName());
		
		
		Locale locale3 = new Locale("fr", "CA");
		System.out.println(locale3.getDisplayName());
		System.out.println(locale3.getDisplayName(Locale.CHINESE));
		
		Calendar cal1 = Calendar.getInstance(locale); //US
		Calendar cal2 = Calendar.getInstance(locale2); 
		
		//지역별 시간 - 타임존
		//지역별 언어? - 로케일
		System.out.println(cal1.getTimeZone());
		System.out.println(cal2.getTimeZone());
	}

}
