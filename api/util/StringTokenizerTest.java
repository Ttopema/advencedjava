package api.util;
//문자열 분리?
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = " java, mysql, html, css, javascript, jquery";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
		
		System.out.println("=========================");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("토큰 : " + token);
		}
		for(int i = 0; i < 1; i++) {
			System.out.println(str);
		}
	}

}
