package thread;

public class AlphaThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
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
