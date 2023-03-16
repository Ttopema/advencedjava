package thread.sysnc;

public class User extends Thread {
	String name;
	Toilet toilet;
	public User(String name, Toilet toilet) {
		super();
		this.name = name;
		this.toilet = toilet;
	}
	
	public void run() {
		//쓰레드로 실행할 코드
		toilet.opne(name);
 	}
	
}
