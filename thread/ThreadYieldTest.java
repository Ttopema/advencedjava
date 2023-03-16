package thread;

//하나가지고 2개 실행되게??
//
class MyThread4 implements Runnable {
	boolean flag;

	@Override
	public void run() {
		while (true) {
			if (flag) {
				Thread.yield(); // 쓰레드가 여러개 실행될 때  --->  다른작업을 할 때 사용
			} else {
				System.out.println(Thread.currentThread().getName() + "실행");
				for (int i = 1; i <= 100000000; i++) {

				}
			}
		}
	}

}

//1. t1과 t2쓰레드가 flag가 false인 동안은 쓰레드의 else절만 실행이 된다.
// => t1과 t2가 번갈아가면서 실행이 된다,

//2. t2의 flag를 true로 바꾸면서 t2가 if절을 실행한다.
// => t2가 실행을 t1한테 양보하게 되면서 즉, yield되면서 모든 실행 제어를 t1한테 넘긴다.
// => t1만 실행된다.
public class ThreadYieldTest {
	public static void main(String[] args) {
		MyThread4 obj1 = new MyThread4();
		Thread t1 = new Thread(obj1);
		t1.setName("t1");
		obj1.flag = false;
		t1.setDaemon(true); // ***데몬쓰레드로 변경(메인쓰레드가 종료되면 같이 종료되는 쓰레드로 변경)
		t1.start();

		MyThread4 obj2 = new MyThread4();
		Thread t2 = new Thread(obj2);
		t2.setName("t2");
//		obj2.flag = false;
		obj2.flag = true; // t2가 t1에 작업을 양보함 Thread.yield();
		t2.setDaemon(true);
		t2.start();

		for (int i = 1; i <= 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//각 쓰레드의 flag값을 1초마다 변경해주고 있는 코드
			obj1.flag = !obj1.flag; // false니까 ture가 됨.
			obj2.flag = !obj2.flag;
			
		}
		
	}

}
