package api.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//DataOutputStream - 기본형 데이터를 쓰기 편하도록 지원되는 스트림
//				   - 파일을 output하지 못하므로 FileOutputStream을 이용해서 작업해야한다.
public class DataOutputStreamTest {

	public static void main(String[] args) throws IOException{
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/data/dos.txt"));
		FileOutputStream fos = new FileOutputStream("src/data/dos.txt");
		DataOutputStream dos = new DataOutputStream(fos);
				
		dos.writeInt(3);
		dos.writeDouble(10.5);
		dos.writeUTF("문자열");
		fos.close();
		dos.close();
	}

}
