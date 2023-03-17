package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//키보드로 입력한 내용을 클라이언트가 보내오면 데이터를 지속적으로 읽어서 클라이언트에게 다시 보내주는 작업을 해보자!
public class EchoServer01 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(12345);
			System.out.println("대기중....");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress() + "님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				//클라이언트가 보내는 데이터를 계속 읽어서 클라이언트에게 다시 보내주는 작업을 처리
				String reMsg = "";
				while(true) {
					//클라이언트로부터 in
					reMsg = in.readLine();
					if(reMsg==null) {
						break;
					}
					System.out.println("클라이언트>>> " + reMsg);
					//클라이언트에게로 out
					out.println(reMsg + "^^");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
