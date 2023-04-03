package jdbc.dao;

import java.util.ArrayList;
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
		// 사용자가 입력한 데이터를 CustomerVO로 생성
		CustomerVO customer = new CustomerVO(id, pass, name, addr, memo);
		// int result = dao.insert(id, pass, name, addr, memo);
		int result = dao.insert(customer);
		if (result > 0) {
			System.out.println("가입완료...환영합니다.");
		} else {
			System.out.println("이미 가입된 사용자입니다. 다시확인하세요....사원번호를 확인하세요.");
		}
	}

	public void getMemberListMenu() {
		System.out.println("************전체사원조회************");
		ArrayList<CustomerVO> userlist = dao.getMemberList();
		int size = userlist.size();
		for (int i = 0; i < size; i++) {
			CustomerVO customer = userlist.get(i);
			System.out.print(customer.getId() + "\t");
			System.out.print(customer.getPass() + "\t");
			System.out.print(customer.getName() + "\t");
			System.out.print(customer.getAddr() + "\t");
			System.out.print(customer.getRegdate() + "\t");
			System.out.print(customer.getPoint() + "\t");
			System.out.println(customer.getMemo() + "\t");
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
		if (result > 0) {
			System.out.println("정보수정이 완료되었습니다.");
		} else {
			System.out.println("정보수정에 실패하였습니다.");
		}
	}

	public void deleteMenu() {
		System.out.println("************퇴사하기************");
		System.out.print("아이디:");
		String id = key.next();
		int result = dao.delete(id);
		if (result > 0) {
			System.out.println("퇴사처리가 완료되었습니다.");
		} else {
			System.out.println("퇴사처리에 실패하였습니다.");
		}
	}

	public void selectMenu() {
		System.out.println("************주소검색************");
		System.out.print("주소:");
		String addr = key.next();
		ArrayList<CustomerVO> userlist = dao.select(addr);
		System.out.println("조회된 레코드 = >(MenuUI) " + userlist.size());
		// 조회된 레코드를 출력하기
		int size = userlist.size();
		for (int i = 0; i < size; i++) {
			CustomerVO customer = userlist.get(i);
			System.out.print(customer.getId() + "\t");
			System.out.print(customer.getPass() + "\t");
			System.out.print(customer.getName() + "\t");
			System.out.print(customer.getAddr() + "\t");
			System.out.print(customer.getRegdate() + "\t");
			System.out.print(customer.getPoint() + "\t");
			System.out.println(customer.getMemo() + "\t");

		}
	}

	public void login() {
		System.out.println("************로그인************");
		System.out.print("아이디:");
		String id = key.nextLine();
		System.out.print("패스워드:");
		String pass = key.next();
		CustomerVO user = dao.login(id, pass);
		if (user != null) {
			System.out.println("로그인 성공 후 페이지");
			System.out.println(user.getName() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}

	}
	
	public void getInfoMenu() {
		System.out.println("************사원정보조회************");
		System.out.println("아이디:");
		String id = key.next();
		CustomerVO customer = dao.getCustomerInfo(id);
		if(customer != null) {
			System.out.println("정보조회 성공");
			System.out.print(customer.getId() + "\t");
			System.out.print(customer.getPass() + "\t");
			System.out.print(customer.getName() + "\t");
			System.out.print(customer.getAddr() + "\t");
			System.out.print(customer.getRegdate() + "\t");
			System.out.print(customer.getPoint() + "\t");
			System.out.println(customer.getMemo() + "\t");
		}
		else {
			System.out.println("정보조회 실패");
		}
	}
}
