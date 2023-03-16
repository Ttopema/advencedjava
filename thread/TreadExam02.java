package thread;
//AlphaThread2, DigitThread2를 Runnable로 변경하여 작업하기



class AlphaThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 65; i <= 90; i++) {
			System.out.print((char)i + "(" + Thread.currentThread().getName() + ")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class DigitThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "(" + Thread.currentThread().getName() + ")");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}

public class TreadExam02 {
	public static void main(String[] args) {
		AlphaThread2 al = new AlphaThread2();
		DigitThread2 di = new DigitThread2();
		Thread t1 = new Thread(al, "t1");
		Thread t2 = new Thread(di, "t2");
		
		t1.start();
		t2.start();
	}

}
