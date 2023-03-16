package api.util.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam01 {
	public static void main(String[] args) {
		// 1. 100,90,77,100,을 HashSet에 저장하기
		HashSet<Integer> set = new HashSet<Integer>();

		set.add(100);
		set.add(90);
		set.add(88);
		set.add(77);
		set.add(100); // 저장

		// 4. 2번에서 정의한 메소드 호출해서 리턴받은 배열 출력하기

		/*
		 * 5.0에서 추가된 for문은 컬렉션을 탐색하기 위한 for 
		 * for(타입 변수명: 컬렉션){
		 * 	  ----      ------ 
		 *  컬렉션(자료구조)에서 꺼낸
		 * 				데이터의 타입 배열, list, set 다 가능 
		 * }
		 */
		int[] arr = changeArr(set); // 배열로 리턴하였으니까 리턴한 값을 다시 배열 변수에 넣어주는 것인가????..
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		print(set);
	}

	// 2. HashSet을 배열로 변환한는 메소드를 작성
	// 메소드명: changeArr
	// 매개변수: HashSet(타입은 임의로 지정)
	// 리턴타입: 배열
	public static int[] changeArr(HashSet<Integer> set) { // HashSet타입을 매개변수로함
		int[] arr = new int[set.size()]; // 배열 초기화
		int i = 0; // **배열의 인덱스 요소 번호가 필요하기 때문에
		for (int data : set) { // **set만큼 돌아서
			arr[i] = data; // **배열 인덱스 하나하나에 돈 set의 값을 넣어준다?
			i++; // 인덱스는 set의 사이즈니까 i++함으로써 종료시켜준다
		}
		return arr; // 배열타입 리턴
	}

	// 3. HashSet에 저장된 요소를 출력하는 메소드
	// => Interator사용해서 출력하기 ==> for문
	// => 메소드 스펙은 임의로 정의하기

	public static void print(HashSet<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
