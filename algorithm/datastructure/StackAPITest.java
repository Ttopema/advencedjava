package algorithm.datastructure;

import java.util.Stack;

//API차원에서의 Stack
// => 한쪽 끝에서만 데이터를 넣고 뺄 수 있는 자료구조
// => 마지막으로 input한 데이터ㅓ가 가장 먼저 output되므로 LIFO(Last In Frist Out)구조
// push => 스택에 데이터 input
// pop => 스택에서 데이터 output
// top => 스택의 가장 위에 있는 데이터 보기 메소드로는 peek()
// empty => 스택이 비어있는지 유뮤를 확인
// size => 스택에 저장된 데이터의 사이즈 확인
public class StackAPITest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//스택에 데이터 넣기
		stack.push("java");
		stack.push("mysql");
		stack.push("jdbc");
		System.out.println("스택에 저장된 요소의 갯수 => " + stack.size());
		System.out.println("스택에 저장된 요소가 있는지 없는지 => " + stack.empty()); // 스택에 저장된 요소가 있으면 false 있으면 true
		System.out.println("스택에 마지막으로 저장된 요소를 확인 => " + stack.peek());
		System.out.println("스택에서 데이터 꺼내기 => " + stack.pop());
		System.out.println("스택에 저장된 요소의 갯수 => " + stack.size());
		System.out.println("스택에 마지막으로 저장된 요소를 확인 => " + stack.peek());
		System.out.println("스택에서 데이터 꺼내기 => " + stack.pop());
		System.out.println("스택에 저장된 요소의 갯수 => " + stack.size());
		System.out.println("스택에 마지막으로 저장된 요소를 확인 => " + stack.peek());
		System.out.println("스택에서 데이터 꺼내기 => " + stack.pop());
		System.out.println("스택에 저장된 요소의 갯수 => " + stack.size());
		
		//스택이 비어있는 상태에서 peek, pop을 호출
//		System.out.println("스택에 마지막으로 저장된 요소를 확인 => " + stack.peek()); // 비어있는 상태에서 호출하면 Exception 발생
//		System.out.println("스택에서 데이터 꺼내기 => " + stack.pop());
		
		
		
	}

}
