package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServerExam01 {
	public static void main(String[] args) {
		Socket clientSocket = null;
		DataInputStream dis = null; // 클라이언트가 보내오는 데이터를 읽기 위한 보조스트림
		DataOutputStream dos = null; // 클라이언트에 보낼 데이터를 출력하기 위한 보조스트림

		// 1. 서버에서 해줘야할 일은 먼저 ServerSocket을 생성하여 사용할 port를 열어준다!!!
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림.....");
			while (true) {
				// 2. 클라이언트가 접속하면 접속한 클라이언트와 통신할 수 있는 소켓객체를 생성!!!
				clientSocket = server.accept();
				String ip = clientSocket.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				dis = new DataInputStream(clientSocket.getInputStream());
				dos = new DataOutputStream(clientSocket.getOutputStream());

				// 클라이언트에게 out
				dos.writeUTF("안녕 환영합니다." + ip + "님");
				dos.writeUTF("출력할 단:");
				
				// 클라이언으로부터 in
				int dan = dis.readInt();
				System.out.println("입력하신 단은" + dan + "입니다.");

				// 클라이언트에게 out
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan + "x" + i + "=" + dan * i);
					dos.writeInt(dan); // out
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
