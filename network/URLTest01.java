package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URL클래스
//웹상의 주소를 나타내는 클래스이고 이를 통해서 
public class URLTest01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
//			URL url = new URL("https://search.naver.com/search.naver?where=image&sm=tab_niv&query=%EC%B4%88%EB%94%A9%EC%A3%BC%EB%A8%B9%EC%A7%A4&nso=so%3Ar%2Ca%3Aall%2Cp%3Aall#");
			System.out.println("url.toString() ==>" + url.toString());
			System.out.println("url.getHost() ==> " + url.getHost());
			System.out.println("url.getPath() ==> " + url.getPath());
			// getProt는 -1로 출력
			// -1포트로 접속했다는 의미가 아니라 프로토콜에 등록되어 있는 기본 포트로 접속했다는 의미
			// http프로토콜에 등록된 기본 port는 80포트
			System.out.println("url.getPort() ==> " + url.getPort());
			System.out.println("url.getProtocol() ==> " + url.getProtocol());

			// 지정한 url에 접속해서 해당 자원을 읽는 작업을 수행
//			InputStream is = url.openStream();
//			
//			System.out.println((char)is.read()); // 한 바이트씩 읽어오므로 엄청 오래걸림

			// input을 하는 경우 한글이 있으면 BufferdReader를 사용, 바이너리데이터면 BufferdInputStream
			// BufferdReader는 보조스트림으로 InputStream을 리턴하는 openStream()의 호출코드를 직접 전달할 수 없으므로
			// 중간에InputStreamReader을 만들어서 전달한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
