package api.util.collection;

import java.util.ArrayList;

public class ArrayListExam03 {
	public static void main(String[] args) {
		/*
		 * 번호 성명 국어 수학 영어 
		 * 1 장동건 100 99 88 
		 * 2 이민호 89 100 100 
		 * 3 김범룡 95 89 100
		 * 
		 * ArrayList<ArrayList<String>> ==> ArrayList에 저장된 ArrayList
		 * 
		 */

		// 1. 데이터를 ArrayList에 저장하기
		// 2. ArrayList에 저장된 모든 데이터를 위와 같은 형식으로 출력하기
		// 3. 출력하는 부분만 메소드로 정의해서 사용하기
		// 메소드명: display
		// 리턴타입 : void
		// 매개변수 ArrayList<ArrayList<String>>

		// 메모리에 올림
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> title = new ArrayList<String>();
		title.add("번호");
		title.add(" 성명");
		title.add(" 국어");
		title.add(" 수학");
		title.add(" 영어");
		list.add(title);

		ArrayList<String> p1 = new ArrayList<String>();
		p1.add("1");
		p1.add(" 장동건");
		p1.add(" 100");
		p1.add(" 99");
		p1.add(" 88");
		list.add(p1);

		ArrayList<String> p2 = new ArrayList<String>();
		p2.add("2");
		p2.add(" 이민호");
		p2.add(" 89");
		p2.add(" 100");
		p2.add(" 100");
		list.add(p2); // ArrayList에 저장된 ArrayList?

		ArrayList<String> p3 = new ArrayList<String>();
		p3.add("3");
		p3.add(" 김범룡");
		p3.add(" 95");
		p3.add(" 89");
		p3.add(" 100");
		list.add(p3);

		//ArrayList에서 데이터 꺼내는 작업
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list.get(i).size(); j++) {
//				System.out.print(list.get(i).get(j));
//
//			}
//			System.out.println();
//		}
		
		display(list);

	}
	public static void display(ArrayList<ArrayList<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j));

			}
			System.out.println();
		}
	}

}
