package api.util.collection;

import java.util.Date;

public class Student {
	private int num;
	private String name;
	private int kor;
	private int math;
	private int eng;
	private Date regdate;
	
	//기본생성자
	public Student() {
		
	}

	public Student(int num, String name, int kor, int math, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.regdate = new Date();
	}
	//toString //역할 알기
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ ", regdate=" + regdate + "]";
	}

	
	//getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	
	
}
