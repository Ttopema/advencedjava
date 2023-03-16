package thread.sysnc;

public class ThreadSyncTest01 {
	public static void main(String[] args) {
		//쓰레드에서 공유할 객체를 생성
		Toilet toilet = new Toilet();
		
		//공유객체를 사용하며 실행될 쓰레드 생성
		User user1 = new User("허영일", toilet);
		User user2 = new User("허영둘", toilet);
		User user3 = new User("허영삼", toilet);
		User user4 = new User("허영사", toilet);
		User user5 = new User("허영오", toilet);
		User user6 = new User("허영육", toilet);
		
		//쓰레드 시작
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		
		
	}

}
