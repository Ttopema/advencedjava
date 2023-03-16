package api.lang;
//String객체의 값 비교
public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		
		//리터럴 값 비교
		//리터럴로 할당되는 String과 new 연산자를 이용하여 할당되는 String객체는 다른 메모리에 할당된다.
		//리터럴의 령태로 할당되는 String객체는 상수풀에 저장되며 문자열이 같은 경우 같은 객체로 인식한다.
		//new 연산자를 사용하여 할당되는 String객체는 heap에 할당되며 new 연산자는 무조건 새로 생성하므로 다른객체로 인식한다.
		if(str1==str2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		
		//주소비교
		if(str3==str4) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(str1==str3) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
	}

}
