package api.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//문자단위로 입력을 하기 위한 모든 클래스의 상위 클래스인 InputStreamReader
//키보드로 입력한 문자를 읽어서 리턴
public class InputStreamReaderTest {
	public static void main(String[] args) {
		// 1. 사용할 API생성
		// => 입력할 데이터 소스와 연결하기
		InputStreamReader in = null;
//		double pi = Math.PI;
		PrintStream pw = System.out;
//		pw.println("gasdafmkamsdk");
		try {
			in = new InputStreamReader(System.in); // 키보드입력을 표현하는 상수를 변수에 저장ㅇ
			while (true) {
				// 2. 데이터 읽기
				// => 모든 데이터를 읽기위해서 반복작업
				int data = in.read(); // 한 문자 한 바이트밖에 못 읽어서 while문으로 돌리는 것임
				if (data == 13) { // enter에 대한 아스키값은 13이고 enter가 입력되면 빠져나오는 것이다.
					break;
				}
				pw.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace(); // 오류 추적기
		} finally { // 종료는 여기에
			// 3. 사용하던 자원을 해제(자원반납)
			try {
				// in에 대한 null체크 - null인 상태에서 실행되면 NullPointerException이 발생하므로
				// in이 null이 아니라면 종료 / null이라면 종료ㄴ x??
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {

			}
		}

	}

}
