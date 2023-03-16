package thread.sysnc;
//모든 쓰레드가 공유해서 사용하는 객체
public class Toilet {
	//synchronized를 메소드 앞에 정의하면
	//쓰레드가 이 객체의 메소드를 호출하는 동안 다른 쓰레드는 접근할 수 없도록 잠금 ==> 동기화 메소드
	
	//메소드의 외부에서 처리하는 경우
	/*
	 *synchronized(공유객체) {
	 *	//동시접속에 대한 처리를 하고 싶은 코드를 정의
	 *	
	 *}
	 * */
	public synchronized void opne(String name) { //name은 공유객체를 사용하는 쓰레드의 이름
		//하나의 쓰레드만 실행하는 영역
		//동시접속을 막는다는 뜻일까??
		System.out.println(name + "(이)가 문열고 들어옴");
		for (int i = 1; i < 100000000; i++) {
			if(i==10000) {
				System.out.println(name + "똥쌈");
			}
			
		}
		System.out.println(name + "(이)가 문열고 나감");
	}

}
