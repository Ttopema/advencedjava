package api.lang;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ObjectTest {
	public static void main(String[] args) {		
		//equals는 하위클래스에서 객체의 속성을 비교해서 같은 객체인지를 확인하는
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1 == obj2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(obj1.equals(obj2)) { //단순히 같냐 다르냐를 비교하는 것이다.
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		//Object클래스의 메소드
		//tpString메소드는 객체의 기본 메소드 - 생략이 가능.
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		//hashCode는 객체가 할당된 메모리를 기준으로 값을 계산해서 리턴하므로 모두 다른 값을 리턴
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		
		//Objcet의 getClass
		System.out.println(obj1.getClass());
		//API에서 제공되는 클래스들에 재정의된 toString확인
		Date d = new Date();
		System.out.println(d);
		
		String str = new String("java");
		System.out.println(str);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("servlet");
		System.out.println(list);
		
		Random rand = new Random();
		System.out.println(rand);
		
	}
	
}
