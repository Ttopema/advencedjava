package thread;
/*
 * 한 번 start된 쓰레드는 절대 다시 실행할 수 없다.
 * => 일회용
 * 
 * [쓰레드를 종료]
 * 1. 임의의 변수를 선언해서 종료하는 방법
 * 	  --------
 * 	  flag
 * 	   -변수에 저장된 값에 따라서 작업을 처리할 용도 ( ex)) 실행 or 종료 - boolean변수, int 변수) - 제어할 용도로 값 설정, -> 1이면 실행, 0이면 종료 / ture면 실행 false면 종료
 * 	   -변수값을 체크(오래걸리는 작업인 경우 중간에 stop할 수 있다.)
 * 
 * */

class StopThread extends Thread{
	//현재 상태값을 저장할 수 있는 변수
	private boolean state = true;

	@Override
	public void run() {
		while(state) {
			System.out.println("현재 쓰레드의 상태: 실행중..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("현재 쓰레드 상태: 종료상태");
	}
	//쓰레드의 현재 상태를 조정할 수 있는 변수(state)를 변경할 수 있는 메소드
	public void stopThread() {
		state = !state;
	}
}
public class StopThreadTest01 {
	public static void main(String[] args) {
		System.out.println("==메인쓰레드 시작==");
		StopThread t1 = new StopThread();
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//쓰레드 실행을 제어하는 state값을 변경하면서 쓰레드가 종료
		t1.stopThread();
		System.out.println("==메인쓰레드 종료==");
	}

}
