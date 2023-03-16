package thread;

class MyThread2 extends Thread {

	@Override
	public void run() {
		// 시간 지연을 위한 코드이다. - 프로그램이 실행되는 시간을 표현
		for (int i = 1; i < 100000000; i++) {

		}
	}

}

public class ThreadStateTest {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		System.out.println("쓰레드의 상태 : " + t1.getState());
		t1.start();
		System.out.println("쓰레드의 상태 : " + t1.getState());

		try {
			// WATING상태가 됨.
			// join을 호출한 쓰레드의 상태를 일시정지 상태로 만들기
			// => main쓰레드를 일시정지 상태로 만들고 t1쓰레드가 작업이 완료될 때까지 대기
			// t1에게 작업을 몰아주는 것임
			// 여기서 main과 t1쓰레드를 보면됨.
			t1.join(); // main쓰레드는 실행이 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("쓰레드의 상태 : " + t1.getState());
	}

}
