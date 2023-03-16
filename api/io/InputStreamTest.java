package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//byte단위로 입력을 하기 위한 모든 클래스의 최상위 클래스인 InputStream
//키보드로 입력한 문자를 byte단위로 읽어서 리턴
public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in; // 키보드입력을 표현하는 상수를 변수에 저장
		double pi = Math.PI;
		PrintStream pw = System.out;
//		pw.println("asdafmkamsdk");
		try {
			while (true) {
				int data = in.read();
				if (data == 13) { // enter에 대한 아스키값은 13이고 enter가 입력되면 빠져나오는 것이다.
					break;
				}
				pw.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace(); // 오류 추적기
		}

	}

}
