package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiverThread extends Thread {
	Socket socket;
	
	
	public ServerReceiverThread(Socket socket) {
		super();
		this.socket = socket;
	}


	@Override
	public void run() {
		BufferedReader in = null;
		
		try {
			while(true) {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String reMsg = "";
				while(true) {
					//클라이언트로부터 in
					reMsg = in.readLine();
					if(reMsg == null) {
						break;
					}
					System.out.println("클라이언트 >>" + reMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
