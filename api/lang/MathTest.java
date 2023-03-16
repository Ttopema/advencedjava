package api.lang;
//Math클래스에 대한 작업
public class MathTest {
	public static void main(String[] args) {
		System.out.println("Math.PI ==> " + Math.PI);
		System.out.println("Math.abs(-1) ==> " + Math.abs(-1));
		System.out.println("Math.ceil(10.3) ==> " + Math.ceil(10.3));
		System.out.println("Math.floor(10.8) ==> " + Math.floor(10.8));
		System.out.println("Math.round(10.6) ==> " + Math.round(10.6));
		System.out.println("Math.max(100,200) ==> " + Math.max(100,200));
		System.out.println("Math.min(100,200) ==> " + Math.min(100,200));
		System.out.println("Math.random()ㄴ ==> " + Math.random()* 10); //0~1사이의 랜덤값
	}

}
