package api.lang;
//String클래스의 메소드를 이용한 데이터변환
public class StringTest04 {
	public static void main(String[] args) {
		String str = "java programming";
		String str2 = new String("java mysql html5 css javascript jquery");
		
		//1. String -> byte[]
		byte[] data1 = str.getBytes();
		for(byte b : data1) {
			System.out.print(b + "\t");
		}
		
		System.out.println();
		//2. String -> char[]
		char[] data2 = str.toCharArray();
		for(int i=0; i<data2.length; i++) {
			System.out.print(data2[i] + "\t");
		}
		System.out.println();
		//3. String -> String[]
		String[] data3 = str2.split(" ");
		for(int i=0; i<data3.length; i++) {
			System.out.print(data3[i] + "\t");
		}
		System.out.println();
		//4. 기본형 -> String
		int i = 1000;
		double d = 10.5;
		test(String.valueOf(i));
		test(String.valueOf(d));
		test(i + "");
		test(d + "");
	}
	
	public static void test(String data) {
		System.out.println("전달받은 데이터 ==> " + data);
	}
}
