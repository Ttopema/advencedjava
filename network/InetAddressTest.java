package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress - 자바에서 IP주소를 모델링해놓은 객체
//			  - 로컬과 도메인을 통해서 IP주소를 가져올 수 있도록 지원하는 API
public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName(args[0]); // 도메인 주소 // 명령행 매개변수
			System.out.println("ia.getHostName() ==> " + ia.getHostName());
			System.out.println("ia.getHostAddress() ==> " + ia.getHostAddress());
			System.out.println("ia.getLocalHost() ==> " + ia.getLocalHost());
			
			InetAddress[] ipArr = InetAddress.getAllByName(args[0]);
			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[i].getHostName() ==> " + ipArr[i].getHostName());
				System.out.println("ipArr[i].getHostAddress() ==> " + ipArr[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
