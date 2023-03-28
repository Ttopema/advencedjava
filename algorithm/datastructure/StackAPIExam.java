package algorithm.datastructure;

import java.util.Stack;

//Stack에 1부터 10까지 데이터를 추가하고
//꺼내서 합을 구해서 출력하기
//[출력형식]
// 스택:1
// 스택:2
// 스택:3
//........
// 총합: 55
public class StackAPIExam {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//집어넣기
		for(int i = 1; i <= 10; i++) {
			System.out.println("스택: " + stack.push(i));
			
			
		}
		//꺼내기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			stack.pop();
//			System.out.println("스택: " + stack.pop());
			sum += i;
		}
		System.out.println("총합: " + sum);
	}

}
