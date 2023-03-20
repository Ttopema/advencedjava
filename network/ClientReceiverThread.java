package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientReceiverThread implements Runnable {
	Socket socket;
	
	
	public ClientReceiverThread(Socket socket) {
		super();
		this.socket = socket;
	}


	@Override
	public void run() {
		BufferedReader in = null; 
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String reMsg = "";
			while(true) {
				//서버로부터 in
				reMsg = in.readLine();
				if(reMsg == null) {
					break;
				}
				System.out.println("서버>> " + reMsg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
