package api.util.collection;

import java.util.ArrayList;

//배열을 ArrayLis로 변환해서 리턴ㅁㄴ하는 메소드를 정의3
// 메소드명: changeArrayList
// 매개변수: String[]
// 리턴타입: ArrayList<String>
public class ArrayListExam02 {
	public static void main(String[] args) {
		String[] strArr = { "java", "servlet", "jsp", "spring" };
		// 2. 1번에서 구현한 changeArrayList 메소드를 호출하기
		ArrayList<String> list = changeArrayList(strArr);
		// 3. 호출결과로 리턴받은 ArrayList에 저장된 요소를 sysout으로 출력하기
		int size = list.size();
		;
		for (int i = 0; i < size; i++) {
			String data = list.get(i);
			System.out.println(data);
		}

	}

	// 1. cangeArrayList메소드를 위에 정의된 스펙대로 작성하기
	// => static메소드로 작성하고 매개변수로 전달받은 배열을 ArrayList 로 변환해서 리턴하기
	public static ArrayList<String> changeArrayList(String[] arr) {
		ArrayList<String> list = new ArrayList<String>(); // 리턴타입 초기화
		// 매개변수로 전달된 배열에서 요소를 하나씩 꺼내서 ArrayList에 저장하기
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		return list;
	}
}
