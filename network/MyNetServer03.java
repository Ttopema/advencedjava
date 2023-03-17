package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//BufferdReader와 PrintWriter를 이용해서 작업하기
public class MyNetServer03 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			server = new ServerSocket(12345);
			System.out.println("접속대기중.....");
			while (true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress() + "님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());

				// 클라이언트에게 out
				/*
				 * PrintWriter는 출력버퍼에 임시로 보관되어 스트림으로 출력될 때까지 대기중인 데이터를
				 * 스트림으로 내보내는 작업을 해야 한다.
				 * flush()를 호출해서 버퍼를 비우는 작업을 처리해야 한다.
				 * -----
				 * 출력버퍼를 비우면서 실제 데이터를 출력하게 된다.
				 * */
				out.println("안녕 환영합니다." + clientInfo.getHostAddress() + "님");
				out.println("출력할 단: ");
				out.flush();

				// 클라이언으로부터 in
				int dan = Integer.parseInt(in.readLine());
				System.out.println("클라이언트가 입력한 단은 " + dan + " 입니다.");
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan + "x" + i + "=" + dan * i);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
