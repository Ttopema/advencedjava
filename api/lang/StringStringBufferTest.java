package api.lang;
//String과 StringBuffer의 성능비교
public class StringStringBufferTest {
	//String으로 객체를 만드는 작업
	public static void stringCheck(int count) {
		long start = System.nanoTime();
		String str = new String("java");
		for(int i=0; i<count; i++) {
			str = str + "java";
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("str = str + java");
		System.out.println("실행시간 : " + time);
		System.out.println(str);
	}
	
	//StringBuffer로 객체를 만드는 작업
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("java");
		for(int i=0; i<count; i++) {
			sb.append("java");
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("sb.append(java)");
		System.out.println("실행시간 : " + time);
		System.out.println(sb);
	}
	
	
	
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("실행횟수: " + count);
		stringCheck(count);
		System.out.println("======================");
		stringBufferCheck(count);
	}

}
