package api.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

//DataInputStream
public class DataInputStreamTest {
	public static void main(String[] args) throws Exception{
		
		DataInputStream dis = new DataInputStream(new FileInputStream("src/data/dos.txt"));
		
		int data1 = dis.readInt();
		double data2 = dis.readDouble();
		String data3 = dis.readUTF();
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		dis.close();
	}

}
