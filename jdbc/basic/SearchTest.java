package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "select empno, ename, job, mgr, hiredate, sal  from emp ";
		sql = sql + "where sal > (select avg(sal) ";
		sql = sql + "from emp ";
		sql = sql + "where deptno = 10) "; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션 성공" + con);
			Statement stmt = con.createStatement();
			System.out.println("Statement객체" + stmt);
			System.out.println();

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) { 
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t"); // 컬럼순서 index는 1부터 시작한다. **원래 저장된 순서가 아니라....
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.println(rs.getInt(6) + "\t");
//				System.out.println(rs.getString(7) + "\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
