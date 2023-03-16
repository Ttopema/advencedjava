package api.lang;

public class SystemTest {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String home = System.getProperty("user.home");
		String version = System.getProperty("java.version");
		String vendor = System.getProperty("java.vendor");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(home);
		System.out.println(version);
		System.out.println(vendor);
		
		//프로그램의 실행시간 - 1970/1/1기준
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			System.out.println("java");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(start);
		System.out.println(end);
		System.out.println("실행시간: " + (end - start));
		
		//나노세컨드 - JVM이 인식하는 현재 시간의 값을 나노세컨드로 반환하는 메소드
		//10억분의 1초
		start = System.nanoTime();
		for (int i = 0; i < 5; i++) {
			System.out.println("java");
		}
		end = System.nanoTime();
		
		System.out.println(start);
		System.out.println(end);
		System.out.println("실행시간: " + (end - start));
	}

}
