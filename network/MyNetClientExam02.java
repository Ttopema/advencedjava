package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClientExam02 {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			socket = new Socket("10.10.0.120",5000);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			
			//서버로부터 in
			String data = in.readLine();
			System.out.println(data);
			
			//서버로부터 in
			int randValue = Integer.parseInt(in.readLine());
			System.out.println("서버가 보내온 랜덤수: " + randValue);
			for (int i = 1; i <= 9; i++) {
				System.out.println(randValue + "x" + i + "=" + randValue * i);
			}
			
			//서버에게로 out
			String msg = "";
			if(randValue % 2 == 0) {
				msg = "짝수";
			}
			else {
				msg = "홀수";
			}
			out.println(msg);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
