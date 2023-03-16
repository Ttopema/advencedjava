package thread;

public class DigitThread extends Thread {

	@Override
	public void run() {
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
