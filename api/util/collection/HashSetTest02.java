package api.util.collection;

import java.util.HashSet;

//합집합과 교집합을 지원함.
//데이터를 공유함으로 계속해서 새로 만들어짐
public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		set1.add("java");
		set1.add("mysql");
		set1.add("servlet");
		set1.add("jsp");
		set1.add("spring");
		set1.add("css");
		print(set1);

		// 합집합 - set을 생성할때 매개변수로 또 다른 Set을 넘기는 작업을 하면됨.
		HashSet<String> set2 = new HashSet<String>(set1);
		set2.add("hadopp");
		set2.add("spark");
		set2.add("flume");
		print(set2);

		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");
		set3.add("servlet");
		set3.add("python");
		set3.add("Raspberrt PI");
		print(set3);
		
		System.out.println("set1과 set3의 교집합 - 교집합이 set3에 새로 설정");
		set3.retainAll(set1);
		print(set3);
		
		System.out.println("set2와 set3의 합집합");
		set2.addAll(set3);
		print(set2);

	}

	public static void print(HashSet<String> set) {
		for (String data : set) {
			System.out.println(data);
		}
		System.out.println("=============================================================");
	}

}
