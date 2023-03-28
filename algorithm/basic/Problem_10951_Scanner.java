package algorithm.basic;

import java.util.Scanner;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//테스트케이스 갯수가 정해지지 않은 경우
//Scanner를 이용하는 경우
public class Problem_10951_Scanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt() + scanner.nextInt());
		}
	}

}
