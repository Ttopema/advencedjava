package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//**비정상 종료가되면 작업관리자에서 백그라운드의 자바.exe 찾아서 종료해준다.
// 알아야할 것
//1. 스트림객체, 보조스트림
// 전송 구조?
public class MyNetServer02 {
	public static void main(String[] args) {
		//try문 안에서 선언하면 지역변수로 인식하기 때문에 미리 밖에 초기화 해준다.
		Socket clientSocket = null;
		InputStream is = null; //클라이언트가 보내오는 데이터를 읽기 위한 스트림객체
		DataInputStream dis = null; //클라이언트가 보내오는 데이터를 읽기 위한 보조스트림
		OutputStream os = null; //클라이언트에 보낼 데이터를 출력하기 위한 스트림객
		DataOutputStream dos = null; //클라이언트에 보낼 데이터를 출력하기 위한 보조스트림
		
		//1. 서버에서 해줘야할 일은 먼저 ServerSocket을 생성하여 사용할 port를 열어준다!!!
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림.....");
			while(true) {
				//2. 클라이언트가 접속하면 접속한 클라이언트와 통신할 수 있는 소켓객체를 생성!!!
				clientSocket = server.accept();
				String ip = clientSocket.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				//3. 클라이언트와 통신할 수 있도록 스트림객체를 생성
				//	1)클라이언트가 전송하는 데이터를 읽기 위한 스트림객체를 소켓 객체를 통해 생성
				clientSocket.getInputStream();
				dis = new DataInputStream(is);
				//	2) 클라이언트에게 전송할 데이터를 보내기 위한 스트림객체를 소켓 객체를 통해 생성
				os = clientSocket.getOutputStream();
				dos = new DataOutputStream(os);
				
				//4. 서버가 클라이언트에게 / 서버 -> 클라이언트 (***순서가 중요***)
				// output2번
				dos.writeUTF(ip + "님 접속을 환영합니다.");
				//           -----------------------------
				//										   -----------------
				//
				//vector생성?
				//arrayList는 쓰레드에 안전하지 않음.?
				dos.writeInt(20000);
				
				//5. 서버 <- 클라이언트
				String clientMsg = dis.readUTF();
				System.out.println("클라이언트가 전송한 메시지 ==> " + clientMsg);
			
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
