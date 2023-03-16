package thread;
class MyThread5 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
//일반쓰레드는 메인쓰레드와 상관없이 자신의 직업이 종료되어야 종료
// 데몬쓰레드로 만드는 작업을 하면 메인쓰레드가 종료되면 쓰레드가 종료되도록 작업할 수 있다.
//start하기 전에 작업해야한다.
public class DaemonThreadTest {
	public static void main(String[] args) {
		System.out.println("main쓰레드 시작");
		MyThread5 t1 = new MyThread5();
		t1.setDaemon(true); // 메인쓰레드가 종료되면 종료되게끔 한다. // 원래는 메인쓰레드가 종료되도 t1은 작업을 계속한다.
		t1.start();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main쓰레드 종료");
	}

}
