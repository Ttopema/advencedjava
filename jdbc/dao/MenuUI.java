package jdbc.dao;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAOImpl();
	public void insertMenu() {
		System.out.println("************사원등록************");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("메모:");
		String memo = key.next();
		int result = dao.insert(id, pass, name, addr, memo);
		if(result > 0) {
			System.out.println("가입완료...환영합니다.");
		}
		else {
			System.out.println("이미 가입된 사용자입니다. 다시확인하세요....사원번호를 확인하세요.");
		}
	}

	public void updateMenu() {
		System.out.println("************사원정보수정************");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("포인트:");
		int point = key.nextInt();
		System.out.print("패스워드:");
		String pass = key.next();
		int result = dao.update(id, point, pass);
		if(result > 0 ) {
			System.out.println("정보수정이 완료되었습니다.");
		}
		else {
			System.out.println("정보수정에 실패하였습니다.");
		}
	}

	public void deleteMenu() {
		System.out.println("************퇴사하기************");
		System.out.print("아이디:");
		String id = key.next();
		int result = dao.delete(id);
		if(result > 0) {
			System.out.println("퇴사처리가 완료되었습니다.");
		}
		else {
			System.out.println("퇴사처리에 실패하였습니다.");
		}
	}

	public void selectMenu() {
		System.out.println("************주소검색************");
		System.out.print("주소:");
		String addr = key.next();
	}
	public void login() {
		System.out.println("************로그인************");
		System.out.print("아이디:");
		String id = key.nextLine();
		System.out.print("패스워드:");
		String pass = key.next();
	}
}
