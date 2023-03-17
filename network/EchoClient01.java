package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//키보드로 입력한 내용을 서버에 보내기
public class EchoClient01 {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null; //서버로부터 전송된 데이터를 읽기 위한 스트림
		PrintWriter out = null;	//서버로 전송할 데이터를 쓰기 위한 스트림
		BufferedReader keyin = null; //키보드로 입력한 데이터를 읽기 위한 스트림
		
		try {
			socket = new Socket("10.10.0.120",12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			//키보드로 입력한 내용이 지속적으로 서버에 전달되로록 구현해보자!
			String sendMsg = "";
			String reMsg = "";
			while((sendMsg=keyin.readLine()) != null) {
				//서버에게로 out
				out.println(sendMsg);
				//서버로부터 in
				reMsg = in.readLine();
				System.out.println("서버>> " + reMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
