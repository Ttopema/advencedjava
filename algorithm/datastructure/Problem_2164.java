package algorithm.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_2164 {
	public static void main(String[] args) throws Exception {
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for (int i = 1; i <= count; i++) {
			queue.offer(i);
		}
		while(queue.size() > 1) {
			queue.poll();//큐 맨 위 카드 버리기
			int data = queue.poll();
			queue.offer(data);//꺼낸 카드 밑으로 보내기
		}
		System.out.println(queue.poll());
	}

}
