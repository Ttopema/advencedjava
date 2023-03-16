package api.lang;

public class Prob1 {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1 = myReplace("hello world", 'l', '*');
		System.out.println(str1);

		System.out.println("-------------Sample 2 --------------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);

		System.out.println("-------------Sample 3 --------------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);

	}
	
	
	public static String myReplace(String str, char oldChar, char newChar) {
		// 이 부분을 구현하시오.
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == oldChar) { // i요소 하나하나에 접근했을 때 oldChar와 같다면
				result = result + newChar; // oldChar는 newChar로 바뀐다. 이런 생각대로라면 끝인데 이게 정답일리 없다. 여기서 무엇을 더 해야할까??
			}
			else {
				result = result + str.charAt(i);
			}
		}
		return result;
	}

}