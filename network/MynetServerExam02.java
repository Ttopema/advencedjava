package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class MynetServerExam02 {
	public static void main(String[] args) {
		Socket socket = null;
		ServerSocket server = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		Random rand = null;
		
		try {
			server = new ServerSocket(5000);
			rand = new Random();
			System.out.println("접속 대기중.......");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				
				//클라이언트에게 out
				out.println("안녕하세요 클라이언트님");
				
				//클라이언트에게 out
				int randValue = rand.nextInt(8) + 2; // 범위지정 어떻게 하는거였더라..
				System.out.println("클라이언트에게 보낸 랜덤수: " + randValue);
				out.println(randValue);
				
				//클라이언트로부터 in
				String msg = in.readLine();
				System.out.println(msg);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
