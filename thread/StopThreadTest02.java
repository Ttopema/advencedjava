package thread;
/*
 * 한번 중지되면 다시 실행하지 못함.
 * 쓰레드종료
 * 2. 인터럽트를 발생시키고 현재 상태를 확인한 후 작업하기
 * */

class StopThread02 implements Runnable {

	@Override
	public void run() {
		try {
			while(!Thread.currentThread().interrupted()) {
				System.out.println("현재 쓰레드 상태: 실행중");
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			
		} finally {
			System.out.println("현재 쓰레드 상태: 종료");
		}
	}

}

public class StopThreadTest02 {

	public static void main(String[] args) {
		System.out.println("main쓰레드 시작");
		Thread t1 = new Thread(new StopThread02());
		t1.start();
		System.out.println("쓰레드 이름: " + t1.getName());
		System.out.println("인터럽트 상태: " + t1.isInterrupted());
		System.out.println("인터럽트 상태: " + t1.isInterrupted());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//인터럽트 발생
		t1.interrupt();
		System.out.println("인터럽트 상태: " + t1.isInterrupted());
		System.out.println("인터럽트 상태: " + t1.isInterrupted());
		System.out.println("main쓰레드 종료");
	}

}
