package api.lang;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("박명준", "광진구 중곡동 170-10", 27);
		Person p2 = new Person("김인호나마에와", "감자국", 26);
		
		if(p1.equals(p2)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p2);
		System.out.println(p2.hashCode());
		
		System.out.println(p1.getName() + ", " + p1.getAddr() + ", " + p1.getAge());
		System.out.println(p2.getName() + ", " + p2.getAddr() + ", " + p2.getAge());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());  
		
		System.out.println(p1.getClass());
	}

}
