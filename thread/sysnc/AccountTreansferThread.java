package thread.sysnc;

public class AccountTreansferThread extends Thread {
	Obj obj;// 공유객체

	public AccountTreansferThread(Obj obj) {
		super();
		this.obj = obj;
	}

	public void run() {
		for (int i = 1; i <= 20; i++) {
			//블럭 안의 작업이 완료되기 전에 다른 쓰레드에서 공유객체를 접근해서 사용할 수 없다.
			//synchronized블럭의 ()안의 매개변수는 공유객체를 명시 
			synchronized (obj) { //끼어들지 못하게
				obj.acc2.withdraw(1000000);
				System.out.println("100만원을 출금했습니다.");
				obj.acc1.deposit(1000000);
				System.out.println("100만원을 입급했습니다.");
			}
		}
	}
}
