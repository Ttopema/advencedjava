package api.util.collection;

import java.util.ArrayList;
//ArrayList의 기본사용법
public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //int[] arr = new int [10]

		
		list.add(10); //arr[0] = 10

		System.out.println("현재 벡터에 저장된 요소의 갯수 : " + list.size()); // 배열의 lenght와 비슷함
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println("현재 벡터에 저장된 요소의 갯수 : " + list.size()); // 배열의 lenght와 비슷함
		
		System.out.println("1번요소에 저장된 값: " + list.get(1));
		
		for (int i = 0; i < list.size(); i++) {
			int data = list.get(i);
			System.out.println(i + "번째 요소" + data);
		}
		
		list.set(10, 100);
		list.remove(0);
		System.out.println("===========================================");
		for(int data2:list) {
			System.out.println("벡터에 저장된 데이터 => " + data2);
		}
		
		if(list instanceof Iterable) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
	}

}
