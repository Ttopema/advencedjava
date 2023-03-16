package thread.sysnc;

public class AccountSumThread implements Runnable {
	Obj obj;// 공유객체

	public AccountSumThread(Obj obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		synchronized (obj) {
			for (int i = 0; i <= 5; i++) {
				long total = obj.acc2.getBalance() + obj.acc1.getBalance();
				System.out.println("총 잔액: " + total);
			}
		}
	}

}
