package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSenderThread implements Runnable {
	Socket socket;
	
	
	public ClientSenderThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg = "";
			while(true) {
				//서버에게로 out
				sendMsg = keyin.readLine();
				if(sendMsg == null) {
					break;
				}
				out.println(sendMsg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
