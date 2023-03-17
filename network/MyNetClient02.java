package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient02 {
	public static void main(String[] args) {
		Socket socket = null;
		// try문 안에서 선언하면 지역변수로 인식하기 때문에 미리 밖에 초기화 해준다.
		Socket clientSocket = null;
		InputStream is = null; // 서버가 보내오는 데이터를 읽기 위한 스트림객체
		DataInputStream dis = null; // 서버가 보내오는 데이터를 읽기 위한 보조스트림
		OutputStream os = null; // 서버에 보낼 데이터를 출력하기 위한 스트림객
		DataOutputStream dos = null; // 서버에 보낼 데이터를 출력하기 위한 보조스트림

		try {
			// 1. 서버에 접속하기 위해 소켓 객체를 생성하기
			socket = new Socket("10.10.0.201", 12345);
			// 2. 서버가 보내오는 데이터를 읽기 위한 스트림을 생성
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			// 3. 서버에 보낼 데이터를 출력하기 위한 스트림을 생성
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			// 4. 클레이언트 <- 서버(서버가 보내오는 데이터를 읽기) - 서버에서 2번 썼기 때문에 2번 연속으로 읽어야함.
			String msg = dis.readUTF();
			System.out.println("서버가 전송한 데이터1: " + msg);
			int intMsg = dis.readInt();
			System.out.println("서버가 전송한 데이터2: " + intMsg);
			
			// 5. 클라이언트 -> 서버
			dos.writeUTF("안녕하세요........ 서버님............ 클라이언트입니다................");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// socket도 close할 수 있다.
//		finally{
//			try {
//				socket.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
	}
}
