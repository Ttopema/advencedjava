package api.util.collection;

import java.util.ArrayList;
import java.util.Random;

//1부터 50까지 랜덤수를 6개 발생시켜서 ArrayList에 저장하고 출력형식대로 출력하라.
//ex) 랜덤수 5,7,9,13,40
//[출력형식]
//5(홀수)......
public class ArrayListExam01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		
		//저장하는 for문
		for(int i=0; i<6; i++) {
			list.add(rand.nextInt(50) + 1);
		}
		//저장된 데이터를 꺼내는 for문
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if(num%2==0) {
				System.out.print(num + "짝수\t");
			}
			else {
				System.out.print(num + "홀수\t");
			}
		}
	}

}
