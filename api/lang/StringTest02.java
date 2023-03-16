package api.lang;
//String클래스의 중요 메소드 살펴보기 -1
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = "재밌다";
		System.out.println("str1.charAt(1) ==> " + str1.charAt(1));
		System.out.println("str1.concat(str2) ==> " + str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.indexOf('a') ==> " + str1.indexOf('a'));
		System.out.println("str1.indexOf(\"합\")" + str1.indexOf("합"));
		System.out.println("str1.lastIndexOf('a') ==> " + str1.lastIndexOf('a'));
		System.out.println("str1.lastIndexOf(\"합\") ==> " + str1.lastIndexOf("합"));
		System.out.println("str1.length() ==> " + str1.length());
		
		//equals와 equalsIgnoreCase는 문자열의 비교
		//equals는 대소문자까지 비교
		//equalsIgnoreCase는 대소문자는 비교하지 않는다.
		System.out.println("str1.equals(\"java programming\") ==> " + str1.equals("java programming"));
		System.out.println("str1.equals(\"java programming\") ==> " + str1.equals("Java programming"));
		
		System.out.println("str1.equalsIgnoreCase(\"java programming\") ==> " + str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"java programming\") ==> " + str1.equalsIgnoreCase("Java programming"));
	}

}
