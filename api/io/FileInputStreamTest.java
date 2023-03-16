package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일 입출력을 위한 작업
// FileInputStream(byte단위 입력)
public class FileInputStreamTest {
	public static void main(String[] args) { //throws Exception { // 예외처리 안 하겠다는 뜻.
		//FileInputStream은 File을 액세스하는 API
		try {
			//1. API 생성
			// => 파일을 자바 프로그램 안에서 사용하기 위해서는 OS와 통신하며 사용할 파일을 먼저 open해야한다.
			// => FileInputStream생성자 내부에서 그러한 작업을 처리
			
			//1)파일경로를 주지 않고 파일명만 입력하는 경우 기본위치에서 찾는다.
			// => 기본위치 : 프로젝트폴더
			//절대경로
//			FileInputStream fis = new FileInputStream("C:\\javaweb\\work\\javawork\\advencedjava\\src\\data\\test.txt"); //파일 경로 - 절대경로
//			FileInputStream fis = new FileInputStream("C:/javaweb/work/javawork/advencedjava/src/data/test.txt"); //파일 경로 /써도 경로로 인식됨.
			//FileInputStream fis = new FileInputStream("test.txt");
			//상대경로
			FileInputStream fis = new FileInputStream("src/data/test.txt"); //파일 경로 - 상대경로
			//2. File액세스
			//파일을 읽어야함
			System.out.println((char)fis.read()); //캐스팅 해야 문자로 읽는다.
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 중에 오류가 발생...");
		}
		finally {
			//3. 파일 닫기 - 자원반납
		}

	}

}
