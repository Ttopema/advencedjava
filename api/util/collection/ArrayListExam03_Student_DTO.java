package api.util.collection;

import java.util.ArrayList;

public class ArrayListExam03_Student_DTO {
	public static void main(String[] args) {
		System.out.println("번호\t성명\t국어\t수학\t영어\t등록날짜");
		Student p1 = new Student(1, "장동건", 100, 98, 88);
		Student p2 = new Student(2, "박명준", 100, 98, 88);
		Student p3 = new Student(3, "김태진", 100, 98, 88);
		
		//위의 Student객체 3개를 ArrayList에 저장하기
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//출력하기
		for (int i = 0; i < list.size(); i++) {
			Student std = list.get(i);
			System.out.print(std.getNum() + "\t");
			System.out.print(std.getName()+ "\t");
			System.out.print(std.getKor()+ "\t");
			System.out.print(std.getMath()+ "\t");
			System.out.print(std.getEng()+ "\t");
			System.out.println(std.getRegdate()+ "\t");
		}
		
		display(list);
		
	}
	public static void display(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			Student std = list.get(i);
			System.out.print(std.getNum() + "\t");
			System.out.print(std.getName()+ "\t");
			System.out.print(std.getKor()+ "\t");
			System.out.print(std.getMath()+ "\t");
			System.out.print(std.getEng()+ "\t");
			System.out.println(std.getRegdate()+ "\t");
		}
	}
}
