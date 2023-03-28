package algorithm.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyStack {
	private int[] mystack;
	private int size; // stack의 사이즈

	public MyStack(int lenght) {
		mystack = new int[lenght];
	}

	public void push(int data) { // 데이터를 내부저장소에 넣고 사이즈를 하나 증가시키기
		mystack[size] = data;
		size++;
	}

	// 스택이 비어있으면 1, 아니면 0을 출력한다.
	public int empty() {
		int result = 0;
		if (size == 0) { // MyStack의 내부저장소가 비어있으면
			result = 1;
		} 
		return result;
	}

	// 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop() {
		if (empty() == 1) { // MyStack의 내부저장소에 데이터가 없는 경우
			return -1;
		} else {
			size -= 1; // MyStack의 내부저장소에서 하나를 빼야하므로 -1 처리
						// MyStack저장소의 데이터를 하나 빼야하기 때문에 실제 size를 -1처리
		}
		return mystack[size];
	}

	// 스택에 들어있는 정수의 개수를 출력한다.
	public int size() {
		return this.size;
	}

	// 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int top() {
		if (size == 0) {
			return -1;
		} else {
			return mystack[size - 1]; // 맨 위의 데이터만 읽어서 리턴
		}
	}
}

public class Problem_10828 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		MyStack stack = new MyStack(count);
		for (int i = 0; i < count; i++) {
			String line = br.readLine();
			String[] resultArr = line.split(" ");

			switch (resultArr[0]) {
			case "push":
				int data = Integer.parseInt(resultArr[1]);
				stack.push(data);
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			case "top":
				System.out.println(stack.top());
				break;
			case "empty":
				System.out.println(stack.empty());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			}
//		stack.push(1);
//		stack.push(2);
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.empty());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		}
	}
}
