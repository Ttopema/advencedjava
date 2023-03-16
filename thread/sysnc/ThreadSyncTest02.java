package thread.sysnc;

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		//공유객체
		Obj obj = new Obj();
		obj.acc1 = new Account("1111-2222-3333-4444", 10000000, "박명준");
		obj.acc2 = new Account("5555-6666-7777-8888", 50000000, "허영재");
		
		//쓰레드생성
		AccountTreansferThread t1 = new AccountTreansferThread(obj);
		Thread t2 = new Thread(new AccountSumThread(obj));
		
		//쓰레드 시작
		t1.start();
		t2.start();
		
	}

}
