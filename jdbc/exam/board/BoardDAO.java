package jdbc.exam.board;

public interface BoardDAO {
	public int insert(String id, String title, String content, int hit);
	public int update(String id, int boardNum, String title, String content);
	public int delete(int boardNum);
}
