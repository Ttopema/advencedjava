package algorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//테스트케이스 갯수가 정해진 경우
//BufferdReader를 이용하는 경우
public class Problem_10950_BufferdReader {
	public static void main(String[] args) {
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		try {
			count = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= count; i++) {
			String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String[] resultArr = line.split(" ");
			System.out.println(Integer.parseInt(resultArr[0]) + Integer.parseInt(resultArr[1]));
		}

	}

}
