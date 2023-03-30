package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSelectTest {
	public void select(String addr) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "exam";
		String password = "exam";
		String sql = "select * from customer where addr like ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공" + con);
			PreparedStatement ptmt = con.prepareStatement(sql); //sql parsing
			System.out.println("PreparedStatement객체" + ptmt);
			ptmt.setString(1, "%" + addr + "%");
			
			
			//select문을 실행
			ResultSet rs = ptmt.executeQuery();
			System.out.println("ResultSet => "+ rs);
			
			while(rs.next()) { // 레코드 탐색: 다음레코드로 커서를 내려서 레코드가 있으면 true리턴, 없으면 false리턴
				System.out.print(rs.getString("id") + "\t"); 
				System.out.print(rs.getString(2) + "\t"); //컬럼순서 index는 1부터 시작한다. **원래 저장된 순서가 아니라....
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7) + "\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		PreparedStatementSelectTest obj = new PreparedStatementSelectTest();
		Scanner scanner = new Scanner(System.in);
		System.out.println("그룹지을 주소: ");
		String addr = scanner.next();
		
		obj.select(addr);
	
		
	}

}
