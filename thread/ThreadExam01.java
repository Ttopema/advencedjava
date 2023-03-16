package thread;
/*
 * 1. A~Z까지 출력하는 AlphaThread작성
 * 		-> A부터 Z까지 출력
 * 		-> 0.5.초 sleep
 * 2. 1~100까지 출력하는 DigitThread작성
 * 		-> 10개 출력하고 줄바꿈
 * 		->0.1.초 sleep
 * 3. 메인쓰레드
 *		-> 1 번과 2번에서 작성한 클래스를 Thread로 실행하기
 *
 *
 * */
public class ThreadExam01 {
	public static void main(String[] args) {
		AlphaThread al = new AlphaThread();
		DigitThread di = new DigitThread();
		
		al.start();
		di.start();
	}

}
