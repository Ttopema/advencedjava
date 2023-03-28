package algorithm.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem_9012 {

	public static String check(String data) {
		String result = "YES";
		Stack<Character> stack = new Stack<Character>();
		for (char c : data.toCharArray())
			if (c == '(') {
				//여는 괄호면 Stack에 push
				stack.push(c);
			} else {
				//닫는 괄효면 pop
				//pop을 해야하는데 Stack이 비어있으면 오류상황
				if (stack.empty()) {
					result = "NO";
				} else {
					stack.pop();
				}
			}
		//모든 작업이 완료됐는데 비어있지 않으면 오류상황
		if (!stack.empty()) {
			result = "NO";
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i <= count; i++) {
			System.out.println(check(br.readLine()));

		}
	}

}
