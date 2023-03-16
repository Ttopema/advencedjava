package api.lang;

public class StringExam01 {
	public static void main(String[] args) {
		String str = "java";
		//str문자열이 다음과 같이 출력되도록 작업하라
		//[출력형식]
		//AVAJ
		str = str.toUpperCase();
		for(int i=str.length() -1; 0 <= i; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
