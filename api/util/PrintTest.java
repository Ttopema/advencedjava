package api.util;

import java.util.Locale;

//System.out.println메소드 확인
public class PrintTest {
	public static void main(String[] args) {
		String str = "java programming";
		String str2 = "재밌다.";
		/*
		 * 출력형식을 기호를 이용해서 설정
		 * %d -> 정수
		 * %s -> 문자열
		 * %f -> 실수
		 * %n -> 줄바꿈
		 * %c -> 문자
		 * 
		 * */
		
		System.out.printf("%s %s %n", str, str2);
		
		//Locale 관련 정보를 추출
		// ISO --> 국제표준화기구
		// 국제표준화기구에서 정한 국가에 대한 정보를 추출
		String[] countries = Locale.getISOCountries();
		for (int i = 0; i < countries.length; i++) {
			Locale locale3 = new Locale("en",countries[i]);
			System.out.printf("2글자 국가코드 : %s | 3글자 국가코드 : %s | 영문국가이름 : %s | 한글국가이름 : %s %n"
					, locale3.getCountry(),
					locale3.getISO3Country(),
					locale3.getDisplayCountry(new Locale("en")),
					locale3.getDisplayCountry());
		}
	}

}
