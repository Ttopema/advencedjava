package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//파일 입출력을 위한 작업
// FileInputStream(byte단위 입력)
public class FileReaderTest {
	public static void main(String[] args) { // throws Exception { // 예외처리 안 하겠다는 뜻.
		// FileInputStream은 File을 액세스하는 API
		FileReader fis = null; //한글 안 깨짐.
		try {
			// 1. 파일 열기
			fis = new FileReader("src/data/test.txt"); // 파일 경로 - 상대경로
			// 2. File액세스
			int count = 0;
			long start = System.nanoTime();
			while(true) {
				int data = fis.read();
				if(data==-1) { // 아무 값이 없으면 -1로 리턴함
					break;
				}
				// 파일을 읽어야함
				System.out.print((char)data); // 캐스팅 해야 문자로 읽는다.
				count++;
			}
			System.out.println("실행횟수: " + count);
			long end = System.nanoTime();
			System.out.println("실행시간 : " + (end-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 중에 오류가 발생...");
		} finally {
			// 3. 파일닫기 - 자원반납
			try {
				if(fis != null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
