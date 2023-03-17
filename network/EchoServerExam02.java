package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//클라이언트와 직접 통신
public class EchoServerExam02 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			server = new ServerSocket(12345);
			System.out.println("대기중....");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress() + "님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				String toClient_sendMsg = "";
				String fromClient_reMsg = "";
				while(true) {
					//클라이언으로부터 in
					fromClient_reMsg = in.readLine();
					if(fromClient_reMsg == null) {
						break;
					}
					System.out.println("클라이언트>> " + fromClient_reMsg);
					//클라이언트에게 out
					toClient_sendMsg = keyin.readLine(); //이거 갑자기 꼈는데 뭐지
					out.println(toClient_sendMsg);
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
