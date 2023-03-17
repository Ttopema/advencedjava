package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;

//키보드로 입력한 내용을 클라이언트가 보내오면 데이터를 지속적으로 읽어서 클라이언트에게 다시 보내주는 작업을 해보자!
public class EchoServerExam01 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Calendar cal = new GregorianCalendar(); // 날짜 정보 알려주기 위한 객체 생성
		try {
			server = new ServerSocket(12345);
			System.out.println("대기중....");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				//클라이언트가 보내는 데이터를 계속 읽어서 클라이언트에게 다시 보내주는 작업을 처리
				String clientMsg = "";
				String msg = "";
				//클라이언트에게로 out
				out.println("서버>> " + "안녕하세요" + ip + "님?");
				
				while(true) {
					//클라이언트로부터 in
					clientMsg = in.readLine();
					if(clientMsg.equals("안녕하세요?") | clientMsg.equals("하이")){
						msg = "서버>> " + ip +"님 반가워요";
					}
					else if(clientMsg.equals("오늘 날짜는")) {
						msg =  "서버>> " + (cal.get(Calendar.MONTH)+1) + "월" + cal.get(Calendar.DATE) + "일";
					}
					else {
						msg = "서버>> " + ip + "님 어여 가~~";
					}
					
					//클라이언트에게로 out
					out.println(msg);
					
					
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
