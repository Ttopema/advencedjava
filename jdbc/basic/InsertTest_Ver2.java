package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest_Ver2 {
	public void insert(String id, String pass, String name, String addr, String memo) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "exam";
		String password = "exam";
		String sql = "insert into customer values ('" + id + "', '"+ pass + "', '" + name + "', '" + addr + "', sysdate(), 1000, '" + memo + "')";
		
		try {
			//1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!!");
			//2. DB서버 접속
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공!!" + con);
			//3. SQL을 실행하기 위해서 Statement객체를 생성하기
			Statement stmt = con.createStatement();
			System.out.println("Statement객체: " + stmt);
			//4. SQL문을 실행
			int result = stmt.executeUpdate(sql);
			//5. 결과처리
			System.out.println(result + "개 행 삽입성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InsertTest_Ver2 obj = new InsertTest_Ver2();
		
		System.out.println("아이디: ");
		String id = scanner.next();
		
		System.out.println("패스워드: ");
		String pass = scanner.next();

		System.out.println("이름: ");
		String name = scanner.next();
		
		System.out.println("주소: ");
		String addr = scanner.next();
		
		System.out.println("메모: ");
		String memo = scanner.next();
		
		obj.insert(id, pass, name, addr, memo);
	}

}
