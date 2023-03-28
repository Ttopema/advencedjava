package algorithm.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/*
 * rear: 큐의 가장 끝쪽 데이터가 삽입된 위치
 * front: 큐의 가장 앞쪽 데이터가 삽입된 위치
 * add: 큐의 rear에 데이터를 ㅎ삽입
 * poll: front부분에 저장된 데이터를 삭제
 * peek: 큐의 맨 앞 부분 즉, front에 있는 데이터를 확인
 * 
 * LinkedList 활용.
 * */
public class QueueAPITest {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); 
		//큐에 데이터 저장하기
		System.out.println(queue.add(1)); //저장공간이 있으면 ture, 없으면 Exception을 발생함
		System.out.println(queue.offer(2));//저장공간이 있으면 ture, 없으면 false를 발생함
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		System.out.println("사이즈 = > " + queue.size());
		System.out.println(queue.poll()); // front의 요소를 꺼내고 결과를 출력(비어있으면 null) - 데이터 꺼내기
		System.out.println(queue.remove()); // front의 요소를 꺼내고 결과를 출력(비어있으면 Exception)데이터 꺼내기
		System.out.println("사이즈 = > " + queue.size());
		System.out.println(queue.poll()); // front의 요소를 꺼내고 결과를 출력(비어있으면 null) - 데이터 꺼내기
		System.out.println(queue.remove()); // front의 요소를 꺼내고 결과를 출력(비어있으면 Exception)데이터 꺼내기
		System.out.println("사이즈 = > " + queue.size());
		
		
		
	}	

}
