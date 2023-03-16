package thread;

class MyThread extends Thread {

	@Override
	public void run() {
		// 시간 지연을 위한 코드이다. - 프로그램이 실행되는 시간을 표현
		for (int i = 1; i < 100000000; i++) {
		}
		System.out.println(getName() + "쓰레드의 우선순위 : " + getPriority());
	}

}

public class ThreadPriorityTest {
	public static void main(String[] args) {
		// 숫자가 클 수록 우선순위가 높다.
		System.out.println(Thread.MAX_PRIORITY); // 시간분배를 더해서 우선순위로 사용을 하겠다는 의미.
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);

		// CPU의 성능을 판단하는 기준 중 하나가 코어의 수
		// --------
		// 연산을 여러 개의 코어가 처리하기 때문에 훨씬 빠르게 처리할 수 있음.
		System.out.println("코어수 : " + Runtime.getRuntime().availableProcessors());

		for (int i = 1; i <= 3; i++) {
			MyThread t1 = new MyThread();
			t1.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			MyThread t = new MyThread();
			t.setName("t" + i);
			t.start();
			if (i == 7) {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}

	}

}
