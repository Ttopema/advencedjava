package jdbc.exam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.dao.DBUtill;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public int insert(String id, String title, String content, int hit) {
		String sql = "insert into tb_board values(?,?,?,sysdate(),0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtill.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, ptmt, con);
		}

		return result;
	}

	@Override
	public int update(String id, int boardNum, String title, String content) {
		String sql = "update tb_board set title = ?, content = ? where  id = ? and boardNum = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;

		try {
			con = DBUtill.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, title);
			ptmt.setString(2, content);
			ptmt.setString(3, id);
			ptmt.setInt(4, boardNum);
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 업데이트 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtill.close(null, ptmt, con);
		}

		return result;
	}

	@Override
	public int delete(int boardNum) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from tb_board ");
		sql.append("where boardNum = ? ");
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtill.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setInt(1, boardNum);
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtill.close(null, ptmt, con);
		}

		return result;
	}

}
