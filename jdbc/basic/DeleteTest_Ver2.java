package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest_Ver2 {
	
	public void delete(String id) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "delete from customer where id = '"+ id +"'";
//		StringBuffer sql = new StringBuffer();
//		sql.append("delete from customer ");
//		sql.append("where addr = '제천'");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공");
			Statement stmt = con.createStatement();
			System.out.println(stmt);
			int result = stmt.executeUpdate(sql);
//			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개 행 삭제 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DeleteTest_Ver2 obj = new DeleteTest_Ver2();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삭제할 아이디 입력: ");
		String id = scanner.next();
		
		obj.delete(id);
	
	}

}
