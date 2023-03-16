package thread;
/*
 * 자바에서 쓰레드 프로그래밍을 하는 방법
 * 1. Thread클래스를 상속 받아 작업
 * 	1) Thread클래스를 상속받는다.
 * 	2) run메소드를 오버라이딩해서 쓰레드로 실행하고 싶은 내용을 구현한다.
 * 							---------------------
 * 							동시 실행 흐름으로 처리하고 싶은 기능들
 * 
 * 		=> run메소드를 직접 호출하지 않는다.  =====> ????????????????
 * 	3) Thread클래스에 정의된 start메소드를 호출한다.
 * 		=> start메소드를 호출하면 JVM내부에 스케쥴러에 의해서 run메소드가 적절한 시점에 호출되는 것이다.
 * 2. Runnable인터페이스의 하위 클래스를 작성하고 이를 이용해서 Thread클래스를 생성하는 방법
 * 
 * 
 * */
// ThreadDemo01를 쓰레드로 처리
class ThreadDemo01 extends Thread {
	//생성자를 정의해서 각 쓰레드의 이름을 설정할 수 있도록 정의
	ThreadDemo01(String name){
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			//Thread클래스의 getName()메소드를 호출해서 생성할때 설정한 쓰레드의 이름을 같이 출력하기
			System.out.print(i + "(" + getName() + ")");
			try {
				Thread.sleep(500);// 프로세스를 잠시 멈추는 메소드
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}
	
}
public class ThreadTest01 {
	public static void main(String[] args) {
		ThreadDemo01 thread1 = new ThreadDemo01("thread1");
		ThreadDemo01 thread2 = new ThreadDemo01("thread2");
		
//		thread1.run(); 직접 호출하지 않는다. 이것은 단순 메소드 call이다.
//		thread2.run();
		
		thread1.start();
		thread2.start();
		
		System.out.println("===메인쓰레드 시작===");
		for (int i = 0; i < 10; i++) {
			System.out.println("main쓰레드");
			try {
				Thread.sleep(500);// 프로세스를 잠시 멈추는 메소드
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("===메인쓰레드 종료===");
	}
	
	

}
