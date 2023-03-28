package algorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//테스트케이스 갯수가 정해지지 않은 경우
//BufferdReader를 이용하는 경우
public class Problem_10951_BufferedReader {
	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while (true) {
			line = br.readLine();
			if (line == null) {
				break;
			}
			String[] resultArr = line.split(" ");
			System.out.println(Integer.parseInt(resultArr[0]) + Integer.parseInt(resultArr[1]));
		}
	}
}
