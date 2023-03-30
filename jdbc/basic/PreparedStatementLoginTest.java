package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementLoginTest {
	public void login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "select * from customer where id = ? and pass = ?";
		//pk에 대한 조회는 while문을 쓰지 않는다.
		//왜일까 고민해보기
		//' or '1' = '1' --   이러면 다뚫림
		//sql인젝션? 그래서 prepareStatement써야함

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공" + con);
			PreparedStatement ptmt = con.prepareStatement(sql);
			System.out.println("PreparedStatement객체" + ptmt);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);

			ResultSet rs = ptmt.executeQuery();
			if (rs.next()) { //pk이기 때문에 레코드 하나만 출력될 것이다 그렇기 때문에 if문으로 출력하면 된다.
				System.out.println("로그인 성공");
				System.out.print(rs.getString("id") + "\t");
				System.out.print(rs.getString(2) + "\t"); // 컬럼순서 index는 1부터 시작한다. **원래 저장된 순서가 아니라....
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7) + "\t");
			}
			else {
				System.out.println("로그인 실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PreparedStatementLoginTest obj = new  PreparedStatementLoginTest();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String id = scanner.nextLine();
		
		System.out.println("패스워드");
		String pass = scanner.nextLine();
		
		obj.login(id, pass);
		
	}

}
