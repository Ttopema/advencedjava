package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
//서버와 직접 통신
public class EchoClientExam02 {
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
			String ip = socket.getInetAddress().getHostAddress();
			System.out.println(ip + "로 접속완료");
			String toServer_sendMsg = "";
			String fromServer_reMsg = "";
			while((toServer_sendMsg=keyin.readLine()) != null) {
				//서버에게로 out
				toServer_sendMsg = keyin.readLine();
				out.println(toServer_sendMsg);
				//서버로부터 in
				fromServer_reMsg = in.readLine();
				System.out.println("서버>> " + fromServer_reMsg);
				
				//싱크가 안 맞는데 뭐가 이상한가?
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
