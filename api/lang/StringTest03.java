package api.lang;
//String 클래스의 중요 메소드 살펴보기 -2
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = "재밌다";
		System.out.println("========시작문자열=========");
		System.out.println("str1.startsWith(\"java\") ==> " + str1.startsWith("java"));//시작문자열
		System.out.println("str1.startsWith(\"test\") ==> " + str1.startsWith("test"));
		System.out.println("========끝문자열=========");
		System.out.println("str1.endsWith(\"java\") ==> " + str1.endsWith("java"));//끝문자열
		System.out.println("str1.endsWith(\"ing\") ==> " + str1.endsWith("ing"));
		System.out.println("str1.endsWith(\"test\") ==> " + str1.endsWith("test"));
		System.out.println("===========포함===========");
		System.out.println("str1.contains(\"java\") ==> " + str1.contains("java"));//포함
		System.out.println("str1.contains(\"ja\") ==> " + str1.contains("ja"));
		
		
		//대소문자 변환
		System.out.println("=========대소문자 변환=========");
		System.out.println("str1.toUpperCase() ==> " + str1.toUpperCase());
		System.out.println("str1.toLowerCase() ==> " + str1.toLowerCase());
		System.out.println(str1); //원본은 변경되지 않는다. 항상 명심하자.
		System.out.println(str2);
		
		//변환?
		System.out.println("========변환?=========");
		System.out.println("str1.substring(5) ==> " + str1.substring(5)); //문자열 추출 - start index
		System.out.println("str1.substring(5, 8) ==> " + str1.substring(5, 8));
		System.out.println("str1.replace('a', 'A') ==> " + str1.replace('a', 'A'));
		System.out.println(str1); //원본은 변경되지 않는다. 항상 명심하자.
		System.out.println(str2);
	}

}
