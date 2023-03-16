package api.io;
//BufferdReader와 같은 보조스트림은 실제 데이터소스(파일, 키보드입력, 네트워크입력...)와 직접연결이 불가능
// -> 실제 데이터소스와 연결되는 스트림객체를 생성한 후에 보조스트림 객체를 만들어야 한다.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferdReaderTest {
	public static void main(String[] args) throws IOException {
		//test.txt파일을 BufferdReader로 읽기
		
		//기본형?
//		FileReader fr = new FileReader("src/data/test.txt");
//		BufferedReader br = new BufferedReader(fr);
		
		//버퍼라는 임시 저장소를 이용해서 입력처리
		BufferedReader br = new BufferedReader(new FileReader("src/data/test.txt"));
		
		//기본형?
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br2 = new BufferedReader(isr);
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		long start = System.nanoTime();
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}
			System.out.println(line);
			count++;
		}
		System.out.println("실행횟수 : " + count);
		long end = System.nanoTime(); // 100만분의 1초여서 1.6초?
		System.out.println("실행시간 : " + (end-start));
	}

}
