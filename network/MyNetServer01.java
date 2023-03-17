package network;

import java.io.IOException;
import java.net.InetAddress;
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
			
			//클라이언트의 접속을 대기하는 작업을 쓰레드로 작업.
			while(true) {
				//클라이언트의 접속을 대기하면서 클라이언트가 접속하면
				//클라이언트와 통신할 수 있도록 input/output이 모두 쓰레드가 생성
				Socket client =  server.accept(); // accept()으로 인해 클라이언트의 접속을 기다린다. 즉, 대기상태로 있는다. 다른 데이터가 치고 들어올 수 없음. 싱크로나이즈드 처리가 됨.
				//서버는 멈추면 안되는데 여기서 멈춘다. 그래서 while문으로 무한루프 돌게 해줘야한다.
				//aacept메소드는 동기화 처리할 수 있는 메소드이다.
				
				//Q1. 동기화?? 동기 비동기의 그 동기?화?
				//그렇다면 동시접속이 불가능할텐데? 한 명 처리하고 그 다음 처리하고
				//그게 프로그램상 너무 빨라서 동시처럼 보이는 것 뿐인가???
				
				InetAddress clientIp = client.getInetAddress();
				System.out.println("접속한 클라이언트 => " + clientIp.getHostAddress());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
