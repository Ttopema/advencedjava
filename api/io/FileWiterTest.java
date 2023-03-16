package api.io;

import java.io.FileWriter;
import java.io.IOException;
//
//FileWriter
//FileWriter는 문자단위로 출력
public class FileWiterTest {
	public static void main(String[] args)throws IOException {
		//파일출력의 기본은 덮어쓰기
		//1. 파일열기
		//=> 파일이 존재하지 않으면 파일을 생성해서 쓴다.
//		FileWriter fw = new FileWriter("src/data/result.txt");
		//append모ㅡ를 ture로 추가하면 데이터가 덮어쓰지 않고 추가된다.
		FileWriter fw = new FileWriter("src/data/result.txt", true);
		//2. 파일액세스
		fw.write(97);
		fw.write(98);
		fw.write("홀ㄹ\n");
		fw.write("으헤헤헤ㅔㅇ헤에헹헤헤ㅔ헤헤ㅔㅎ헤헤에헤ㅔ에헤에헤ㅔ\n");
		//3.파일닫기
		fw.close();
	}

}
