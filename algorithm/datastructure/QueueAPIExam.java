package algorithm.datastructure;

import java.util.LinkedList;
import java.util.Queue;

//Queue에 1부터 10까지 데이터를 추가하고
//꺼내서 합을 구해서 출력하기
//[출력형식]
//스택:1
//스택:2
//스택:3
//........
//총합: 55
public class QueueAPIExam {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//데이터 넣기
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		
		int sum = 0;
		//데이터 꺼내기
		for (int i = 1; i <= 10; i++) {
			System.out.println("큐 : " + queue.poll());
			sum+=i;
			
		}
		System.out.println("총합 : " + sum);
	}

}
