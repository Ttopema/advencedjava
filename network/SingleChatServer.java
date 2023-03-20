package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {
	public static void main(String[] args) {

		// 서버소켓을 메인에서 열어야함.
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("클라이언트 접속을 대기");
			while (true) {
				Socket socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();

				ServerReceiverThread reServer = new ServerReceiverThread(socket);
				ServerSenderThread sendServer = new ServerSenderThread(socket);
				
				// 서버쓰레드 실행
				reServer.start();
				sendServer.start();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
