package api.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//IO패키지까지 작업 직접 다 할 수 있어야함 ㅈ됨
//File객체를 통한 예제 -- 파일 제어할 때 사용
public class FileExam {
	public static void main(String[] args) {
		
		File file = new File("src/data");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		File[] files = file.listFiles();
		for (File f : files) {
			if(f.isDirectory()) { //불린형
				System.out.println(f.getName() + "---------[폴더]");
			}														//**메소드에 마우스 포인트 가져다대면 타입 뭐 써야하는지 나옴 매개변수로. 이거 잘 활용하자
			else { 												// long                  String(Date타입)     long(long타입) long
				System.out.println(f.getName() + "---------[파일](" + f.length() + ":" + sdf.format(new Date(f.lastModified())) + ")");
			}
		}
		//file객체의 내부에 있는 파일과 모든 폴더를 출력하라
		//test -----------[폴더]
		//score.txt ---------------[파일(15:2023/03/10)]
		//							   ----	----------
		//							  파일사이즈
		//									마지막으로 수정한 날짜 --> util패키지의 SimpleDateFormat 사용
		//1. 지정한 File객체의 내부 정보를 받아올 수 있는 메소드를 찾아야한다.
		//	=> File클래스의 API에서 결과가 배열이나 자료구조인 메소드를 찾아야한다. -- for문으로 돌려서 출력하자.
		//	=> File API문서에서 찾아서 작업한다.
		
		
		
		
		//이건 뭐 개짓거리냐
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		Calendar cal = Calendar.getInstance();
//		String time = sdf.format(cal.getTime());
//		long date = 0;
//		date = file.lastModified(); //수정 날짜
//		
//		String[] data = {};
//		data = file.list();
//		long data2 = 0;
//		data2 = file.length(); // data1 배열 각 인덱스로 접근해서 파일 사이즈를 구해야 할 것이다. ==> 응 개소리야 
//		for (int i = 0; i < data.length; i++) {
//			System.out.println("[" + data[i] + "(" + data2 + ":" + ")" + "]"); //파일 내부에 있는 파일과 모든 폴더 출력 ==> 뒤에 사이즈와 마지막 수정날짜만 찾으며ㅑㄴ됨.
//		}
		
		
		
		
	}

}
