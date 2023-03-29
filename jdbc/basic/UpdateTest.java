package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "update customer set addr = '서울특별시' where addr = '서울'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공");
			Statement stmt = con.createStatement();
			System.out.println(stmt);
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 행 업데이트 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
