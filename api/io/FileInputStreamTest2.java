package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일 입출력을 위한 작업
// FileInputStream(byte단위 입력)
public class FileInputStreamTest2 {
	public static void main(String[] args) { // throws Exception { // 예외처리 안 하겠다는 뜻.
		// FileInputStream은 File을 액세스하는 API
		FileInputStream fis = null;
		try {
			// 1. 파일 열기
			fis = new FileInputStream("src/data/test.txt"); // 파일 경로 - 상대경로
			int count = 0;
			// 2. File액세스
			while(true) {
				int data = fis.read();
				if(data==-1) {
					break;
				}
				// 파일을 읽어야함
				System.out.print((char)data); // 캐스팅 해야 문자로 읽는다.
				count ++;
			}
			System.out.println("실행횟수 : " + count);
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
