package network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//class imgDownload extends Thread {
//
//	@Override
//	public void run() {
//		
//	}
//
//}
//
//class imgSearch extends Thread {
//
//	@Override
//	public void run() {
//		
//	}
//
//}

public class URLExam {
	public static void main(String[] args) {
		// 웹상에서 검색할 수 있는 이미지 리소스에 접속하고 파일로 저장하는 작업을 해보자
		// => 이미지 다운로드
		// images폴더에 myImg.jpg로 저장하기
		// 이미지 다운로드 / 이미지 검색에 대한 쓰레드를 각각 처리한다.
		
		//로직
		// 1. 이미지를 읽는다. 즉, 이미지 주소를 읽는다.
		// 2. path를 지정해 읽어온 이미지 파일을 넣는다.
		
		BufferedInputStream bi = null;
		FileOutputStream download = null; 
		try {
			String downPath = "src/images/myImg.jpg";
			String imgURL = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA1MTZfODAg%2FMDAxNjIxMTYxNzY4Njkw.NG2xdam01bzOhpEbIQmr8xugRflWGui7tqAytF2EGIsg.jFg0LLdYrb5mYDTT-rhdTgS-EKJ8Vt_nPPF5M8KDFg4g.JPEG.obslove13%2F1621161478660.jpg&type=a340";
			URL url = new URL(imgURL);
			//1. URL에 명시된 자원에 접속해서 데이터 읽어오기
			bi = new BufferedInputStream(url.openStream());
			download = new FileOutputStream(downPath);
			
			//2. 읽어온 스트림 파일로 저장
			while (true) {
				int data = bi.read();
				if(data == -1) {
					break;
				}
				
				download.write(data); //파일로 쓰기
				System.out.println(data);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				download.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
