package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyNetClient03 {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			socket = new Socket("10.10.0.120",12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//autoflush속성을 true로 설정하면 println메소드가 호출될 때 자동으로 flush메소드를 호출한다.
			out = new PrintWriter(socket.getOutputStream());
			
			// 서버로부터 in
			String data1 = in.readLine();
			String data2 = in.readLine();
			System.out.println(data1);
			System.out.println(data2);
			
			// 서버에게 out
			out.println(7);
			out.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
