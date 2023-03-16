package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient01 {
	public static void main(String[] args) {
		try {
			//서버와 통신할 수 있는 클라이언트 소켓객체를 생성
			//ip와 port정보를 입력 => 서버의 ip, 서버에서 열어놓은 port
			Socket socket = new Socket("10.10.0.201", 50000);
			System.out.println("서버에 접속 완료!!!!!");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//서버에서 대기중일때 클라이언트에서 실행하면 연결된다. 다만 같은 대역폭에 있어야한다.
	}

}
