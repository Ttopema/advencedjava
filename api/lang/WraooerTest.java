package api.lang;
//기본형데이터를 ㅏㅁ조형으로 변환할 수 있는 클래스
// => Wrapper클래스의 오토박싱 언박싱에 대한 개념
public class WraooerTest {
	public static void main(String[] args) {
		//5.0이전 버전
		int i = 10;
		Integer in = new Integer(i);
		test(in);
		
		//5.0 이후 버전
		int j = 100;
		Integer in2 = j;
		test(j); // 5.0이후 버전의 jdk에서는 컴파일러가 자동으로 변환해준다.
				// 참조형 매개변수를 요구하는 메소드에 기본형 데이터를 전달해도 자동으로
				// Integer in new Integer(j)와 같은 코드를 실행해준다.
				// 이를 오토박싱이라 한다.ㄴㄴㄴㄴㄴㄴㄴ
	}
	public static void test(Object obj) {
		//5.이전 버전
		//Object -> Integer변환
		Integer in = (Integer)obj;
		//Integer를 int로 변환
		int myoldval = in.intValue();
		System.out.println("5.0이전 버전 ==> " + myoldval);
		System.out.println("==============================================");
		
		//5.0이후 버전
		int myval = (Integer)obj; // int형 변수에 참조변수를 전달하는 경우
								  // 컴파일러가 자동으로 객체로 포장된 값을 기본형으로 변환해서 전달
								  // 오토언박싱
		System.out.println("5.0이후 버전 ==> " + myval);
		System.out.println("5.0이후 버전 ==> " + obj);
	}
}
