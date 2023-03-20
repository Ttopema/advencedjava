package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SingleChatClient {
	public static void main(String[] args) {
		try {
			//Socket객체를 생성하면 바로 서버에 접속하게 됨.
			//서버쪽에서는 accept메소드가 실행된다.
			Socket socket = new Socket("10.10.0.201", 12345);
			System.out.println();
			//서버와 통신할 쓰레드 객체를 생성해서 start하기
			new Thread(new ClientSenderThread(socket)).start();
			new Thread(new ClientReceiverThread(socket)).start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
