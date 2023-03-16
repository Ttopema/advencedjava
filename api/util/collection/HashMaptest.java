package api.util.collection;

import java.util.HashMap;
import java.util.Set;

//Map
// => key와 value 저장하기 위해서 사용
// => key와 value에 대한 모든 타입을 다 정의하고 작업하기
// => servlet과 jsp내부에서 사용하는 데이터 저장구조가 모두 Map
public class HashMaptest {
	public static void main(String[] args) {
		// 1. HashMap생성
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 2. Map에 데이터 저장하기
		// => Map도 순서가 없는 자료구조, key의 값으로 저장될 위치를 계산해서 저장되기 때문에 추출했을 때 순서대로 나오지 않는다.
		map.put("1", 100);
		map.put("2", 200);
		map.put("3", 300);
		map.put("4", 400);
		map.put("5", 500);
		map.put("6", 600);
		map.put("7", 700);
		//3. map에 저장된 요소의 갯수
		System.out.println(map.size());
		
		//4. map에서 데이터꺼내기
		System.out.println("1번키의 값 : "+ map.get("1"));
		
		//5. *******Map에 저자왼 모든 데이터를 한꺼번에 꺼내서 출력하기
		//	1) map의 모든키를 추출(모든 key가 set에 담겨서 리턴)
		//	2) 반복문 안에서 키를 이용해서 map에서 데이터를 꺼내기
		Set<String> keylist = map.keySet();
		for (String key : keylist) {
			int value = map.get(key);
			System.out.println(key + ", "+ value);
		}
		
		
		
		if(map instanceof Iterable) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
	}

}
