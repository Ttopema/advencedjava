package api.io;

import java.io.FileInputStream;

public class FileInputSteramTest3 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("src/data/test.txt");
		byte[] bytearr = new byte[100]; // 글자수?
		int count = 0;
		while(true) {
			//바이트배열을 매개변수로 전달하면 byte[] 배열의 갯수만큼 읽고 byte[]에 저장 - read메소드는 읽은 byte수를 리턴함. 글자수?리턴?
			int data = fis.read(bytearr);
			if(data == -1) {
				break;
			}
			
			System.out.println(data);
			
			for (int i = 0; i < data; i++) {
				System.out.print((char)bytearr[i]);
			}
			count++;
		}
		System.out.println(count);
		fis.close();
	}

}
