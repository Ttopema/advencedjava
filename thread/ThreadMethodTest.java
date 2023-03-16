package thread;

public class ThreadMethodTest {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("쓰레드 이름 : " + t.getName());
		// 작업 중인 쓰레드 갯수
		System.out.println("실행중인 쓰레드 갯수 : " + Thread.activeCount());
		// 아무일 하지 않는 쓰레드 만들기
		for (int i = 1; i <= 3; i++) {
			Thread t2 = new Thread(); // 쓰레드를 만듦.
			System.out.println(t2.getName());
			t2.start();
		}
		for (int i = 1; i <= 3; i++) {
			Thread t2 = new Thread("t" + i); // 쓰레드를 만듦.
			System.out.println(t2.getName());
			t2.start();
		}
		for (int i = 1; i <= 3; i++) {
			Thread t2 = new Thread(); // 쓰레드를 만듦.
			System.out.println(t2.getName());
			t2.start();
		}
		System.out.println("실행중인 쓰레드 갯수 : " + Thread.activeCount());
	}

}
