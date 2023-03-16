package api.io;

import java.io.File;

//File 클래스 API에 대해서 살펴보자
//=> File과 DIrectory를 자바에서 제어하기 위해 제공되는 클래스
public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("src/data/test.txt");
		File file2 = new File("src/data");
		System.out.println(file); // toString메소드가 생략됨(파일의 path를 출력하도록 오버라이딩되어있음)
		System.out.println("file.canRead() ==> " + file.canRead());
		System.out.println("file.canWrite() ==> " + file.canWrite());
		System.out.println("file.getAbsolutePath() ==> " + file.getAbsolutePath()); //절대경로를 알려주는 메소드
		System.out.println("file.getName() ==> " + file.getName());
		System.out.println("file.getParent() ==> " + file.getParent());
		System.out.println("file.getPath() ==> " + file.getPath());
		
		System.out.println("=====================================================");
		System.out.println("file.isDirectory() ==> " + file.isDirectory());
		System.out.println("file.isFile() ==> " + file.isFile());
		System.out.println("file2.isDirectory() ==> " + file2.isDirectory());
		System.out.println("file2.isFile() ==> " + file2.isFile());
		
		System.out.println("=====================================================");
		System.out.println("file.lastModified() ==> " + file.lastModified());
		System.out.println("file.length() ==> " + file.length()); //사이즈?
//		file.setReadOnly(); // txt파일 속성에 들어가보면 읽기전용으로 바뀜
		
	}

}
