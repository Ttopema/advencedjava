package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerSenderThread extends Thread {
	Socket socket;

	public ServerSenderThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			out = new PrintWriter(socket.getOutputStream());
			keyin = new BufferedReader(new InputStreamReader(System.in));
			String sendMsg = "";
			while(true) {
				//클라이언트에게 out
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
