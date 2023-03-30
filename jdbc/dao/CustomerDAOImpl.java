package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//MySQL 액세스하기 위한 기능 - customer테이블에 대한 CLRUD를 정의
public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int insert(String id, String pass, String name, String addr, String memo) {
		String sql = "insert into customer values (?,?,?,?,sysdate(),1000,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;

		try {
			System.out.println("드라이브 로딩 성공");
			con = DBUtill.getConnect();
			ptmt = con.prepareStatement(sql);
			System.out.println(ptmt);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, ptmt, con);
		}
		return result;
	}

	@Override
	public int update(String id, int point, String pass) {
		String sql = "update customer set point = ?, pass = ? where id = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;

		try {
			System.out.println("드라이브 로딩 성공");
			con = DBUtill.getConnect();
			System.out.println("커넥션 성공");
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, point);
			ptmt.setString(2, pass);
			ptmt.setString(3, id);
			System.out.println(ptmt);
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 업데이트 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, ptmt, con);
		}
		return result;
	}

	@Override
	public int delete(String id) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from customer ");
		sql.append("where id = ? ");
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;

		try {
			System.out.println("드라이브 로딩 성공");
			con = DBUtill.getConnect();
			System.out.println("커넥션 성공");
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setString(1, id);
			System.out.println(ptmt);
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, ptmt, con);
		}
		return result;
	}

	@Override
	public void select(String addr) {
		String sql = "select * from customer where addr like ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			System.out.println("드라이브 로딩 성공");
			con = DBUtill.getConnect();
			System.out.println("커넥션 성공" + con);
			ptmt = con.prepareStatement(sql); // sql parsing
			System.out.println(ptmt);
			ptmt.setString(1, "%" + addr + "%");

			// select문을 실행
			rs = ptmt.executeQuery();
			System.out.println(rs);

			while (rs.next()) { // 레코드 탐색: 다음레코드로 커서를 내려서 레코드가 있으면 true리턴, 없으면 false리턴
				System.out.print(rs.getString("id") + "\t");
				System.out.print(rs.getString(2) + "\t"); // 컬럼순서 index는 1부터 시작한다. **원래 저장된 순서가 아니라....
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7) + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(rs, ptmt, con);
		}

	}

	@Override
	public void login(String id, String pass) {
		String sql = "select * from customer where id = ? and pass = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			System.out.println("드라이브 로딩 성공");
			con = DBUtill.getConnect();
			System.out.println("커넥션 성공" + con);
			ptmt = con.prepareStatement(sql);
			System.out.println(ptmt);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);

			rs = ptmt.executeQuery();
			System.out.println(rs);
			
			if (rs.next()) { // pk이기 때문에 레코드 하나만 출력될 것이다 그렇기 때문에 if문으로 출력하면 된다.
				System.out.println("로그인 성공");
				System.out.print(rs.getString("id") + "\t");
				System.out.print(rs.getString(2) + "\t"); // 컬럼순서 index는 1부터 시작한다. **원래 저장된 순서가 아니라....
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7) + "\t");
			} else {
				System.out.println("로그인 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(rs, ptmt, con);
		}
	}

}
