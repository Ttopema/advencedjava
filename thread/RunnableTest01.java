package thread;

/*
 * 자바에서 쓰레드 프로그래밍을 하는 방법
 * 1. Thread클래스를 상속 받아 작업
 * 	
 * 2. Runnable인터페이스의 하위 클래스를 작성하고 이를 이용해서 Thread클래스를 생성하는 방법
 * 		=> 다른 클래스를 이미 상속하고 있는 경우 Thread클래스를 상속해서 쓰레드 프로그래밍을 할 수 없다.
 * 		1)Runnable 인터페이스를 상속한다.(구현)
 * 		2)run메소드를 오버라이딩해서 쓰레드 프로그래밍으로 구현하고 싶은 내용을 정의한다.
 * 		3)쓰레드를 시작하는 곳에서 
 * 			Runnable객체(Runnable의 하위객체)를 이용해서 Thread객체를 생성
 * 			=>Runnable하위객체를 생성
 * 			  Thread객체를 생성하면서 Runnable하위객체를 매개변수로 전달
 * 
 * 		4)Thread객체의 start메소드를 호출한다.
 * 			=> 쓰레드작업을 스케쥴러에게 의뢰하는 것이다.
 * 
 * */

class Super{
	
}

//ThreadDemo01를 쓰레드로 처리
class RunnableDemo01 extends Super implements Runnable {
	//생성자를 정의해서 각 쓰레드의 이름을 설정할 수 있도록 정의

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			//Runnable을 상속하여 작업하는 경우
			//Thread클래스의 currentThread()메소드를 이용하여 현재 실행중인 쓰레드 객체를 리턴받아 사용한
			System.out.print(i + "(" + Thread.currentThread().getName() + ")");
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


public class RunnableTest01 {
	public static void main(String[] args) {
		System.out.println("===메인쓰레드 시작===");
		//1. Runnable 하위 객체를 생성
		RunnableDemo01 obj = new RunnableDemo01();
		//2. 생성한 Runnable객체를 이용해서 Thread객체를 생성
		Thread t1 = new Thread(obj, "t1");
		Thread t2 = new Thread(new RunnableDemo01(), "t2");
		
		t1.start();
		t2.start();
		
		
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
