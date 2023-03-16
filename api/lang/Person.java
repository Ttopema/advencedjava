package api.lang;

//일반글래스 - nomal클래스 (POJO: Plain Old Java Object)
public class Person {
	private String name;
	private String addr;
	private int age;

	public Person() {

	}
	
	
	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	
	@Override
	public boolean equals(Object obj) {
		//obj가 Person타입인지 검사
		if(obj instanceof Person) {
			//객체의 값을 비교해야 하므로 Person의 멤버에 액세스해야 한다. 따라서 캐스팅 헤야한다.\
			//instanceof연산자로 타입을 체크했기 때문에 if문 안에서 obj변수를 따로 캐스팅하지 않고 멤버를 접근할 수 있다.
			//이전버전에서는 불가능
			Person p = (Person)obj;
			//객체의 모든 값들을 비교
			if(this.name.equals(p.name) & this.addr.equals(p.addr) & this.age == p.age) {
				return true;
			}
			else {
				return false;
			}
		}
		return super.equals(obj);
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}


	//s,g
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
