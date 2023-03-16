package api.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Set - 넣고 빼고 꺼내는 작업 중요함
// => 집합(순서가 없고, 중복이 허용되지 않는다.)
public class HashSetTest01 {
	public static void main(String[] args) {
		// ArrayList는 중복이 허용됨.
		ArrayList<String> list = new ArrayList<String>();
		list.add("자바");
		list.add("서블릿");
		list.add("JSP");
		list.add("스프링");
		list.add("스프링");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("================================");

		// 1. HashSet을 생성
		HashSet<String> set = new HashSet<String>();
		// 2. HashSet에 데이터 추가
		set.add("자바");
		set.add("서블릿");
		set.add("JSP");
		set.add("스프링");
		set.add("스프링");

		// 3. Set에 저장된 요소의 갯수
		System.out.println(set.size()); // 스프링이 중복되어 사이즈가 4로 잡힌다.
		System.out.println(set.contains("스프링")); // 해당 객체가 있는지 검사하는 메소드
		System.out.println("================================");
		// 4. set에 저장된 요소를 출력하기
		// => set은 선형구조가 아니라 순서대로 읽어올 수 없다.
		for (String data : set) {
			System.out.println(data);
		}
		
		System.out.println("================================");

		// 전체 데이터를 액세스 하는 경우 표준 포맷인 Iterator로 변환한 후에 읽는다.
		// 1. HashSet을 Iterator로 변환하기
		Iterator<String> it = set.iterator();
		//Iterator에 담긴 데이터를 꺼내기
		//=> Iterator에 데이터가 있ㄴ는지 확인하고 있으면 꺼내는 작업을 반복해서 수행
		//=> 데이터가 있으면 hassNext가 true를 리턴하고 없으면 false를 리턴함.
		while(it.hasNext()) {
			String data = it.next(); // Iterator에 저장된 데이터를 꺼내기
			System.out.println(data);
		}
		System.out.println("================================");
		set.remove("스프링");
		System.out.println(set.size());
		
		
		if(list instanceof Iterable) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
	}

}
