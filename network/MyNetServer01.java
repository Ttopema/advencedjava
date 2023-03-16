package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//네트워크
//쓰레드
//IO
//3가지 개념을 알고있어야 한다.

//서버용 프로그램
// => 서버는 클라이언트가 언제라도 접속할 수 있도록 포트를 열고 무한대기해야 한다.
// 												  -------
//												  무한루프로 처리하기

public class MyNetServer01 {
	public static void main(String[] args) {
		try {
			//1. 클라이언트와 통신할 수 있도록 준비하기
			// => 클라이언트와 통신할 수 있도록 ServerSoket객체를 생성하고
			ServerSocket server = new ServerSocket(50000); // 50000번 포트를 열었다.
			System.out.println("서버 준비 완료...클라이언트의 접속을 기다림...");
			//2. 클라이언트가 접속하면 클라이언트 정보를 가져와서 작업해야 한다.
			// => 그렇기에 대기하다가 클라이언트가 접속하면 클라이언트 정보를 객체로 만들어서 리턴한다.
			// 									  -----------
			// 									 소켓으로 만들어져서 리턴된다.
			Socket client =  server.accept(); // accept()으로 인해 클라이언트의 접속을 기다린다. 즉, 대기상태로 있는다.
			System.out.println(client);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
