package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatementUpdateTest {
	
	public void update(String id, int point, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "update customer set point = ?, pass = ? where id = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공");
			PreparedStatement ptmt = con.prepareStatement(sql); 
			ptmt.setInt(1, point);
			ptmt.setString(2, pass);
			ptmt.setString(3, id);
			System.out.println(ptmt);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 업데이트 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PreparedStatementUpdateTest obj = new PreparedStatementUpdateTest();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String id = scanner.next();
		
		System.out.println("변경할 포인트: ");
		int point = scanner.nextInt();
		
		System.out.println("변경할 패스워드");
		String pass = scanner.next();
		
		
		obj.update(id, point, pass);;
		
	}

}
