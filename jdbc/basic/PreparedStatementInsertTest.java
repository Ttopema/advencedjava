package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsertTest {
	public void insert(String id, String pass, String name, String addr, String memo) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "exam";
		String password = "exam";
		//2)sql문의 외부에서 입력받을 부분을 ?로 표시
		String sql = "insert into customer values (?,?,?,?,sysdate(),1000,?)";
		
		try {
			//1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!!");
			//2. DB서버 접속
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공!!" + con);
			//3. SQL을 실행하기 위해서 Statement객체를 생성하기
			//1) sql문을 전달하며 객체를 생성
			PreparedStatement ptmt = con.prepareStatement(sql);
			System.out.println("PreparedStatement객체: " + ptmt);
			//3) ?에 값 지정하기
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);
			//4. SQL문을 실행 - PreparedStatement를 사용하는 경우에는 sql을 메소드의 매개변수로 전달하지 않는다.
			int result = ptmt.executeUpdate();
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
		PreparedStatementInsertTest obj = new PreparedStatementInsertTest();
		
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
