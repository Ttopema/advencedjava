package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyNetClientExam01 {
	public static void main(String[] args) {
		Socket socket = null;
		// try문 안에서 선언하면 지역변수로 인식하기 때문에 미리 밖에 초기화 해준다.
		Socket clientSocket = null;
		DataInputStream dis = null; // 서버가 보내오는 데이터를 읽기 위한 보조스트림
		DataOutputStream dos = null; // 서버에 보낼 데이터를 출력하기 위한 보조스트림

		Scanner scanner = new Scanner(System.in); // 단을 입력하기 위한 Scanner객체 생성

		try {
			// 1. 서버에 접속하기 위해 소켓 객체를 생성하기
			socket = new Socket("10.10.0.120", 12345);
			// 2. 서버가 보내오는 데이터를 읽기 위한 스트림을 생성
			dis = new DataInputStream(socket.getInputStream());
			// 3. 서버에 보낼 데이터를 출력하기 위한 스트림을 생성
			dos = new DataOutputStream(socket.getOutputStream());

			// 서버로부터 in
			String data1 = dis.readUTF();
			String data2 = dis.readUTF();
			System.out.println(data1);
			System.out.println(data2);

			// 서버에게 out
			dos.writeInt(scanner.nextInt()); // out

			// 서버로부터 in
			int gugu = dis.readInt();
			System.out.println(gugu);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
