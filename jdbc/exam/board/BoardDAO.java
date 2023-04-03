package jdbc.exam.board;

import java.util.ArrayList;

public interface BoardDAO {
	public int insert(String id, String title, String content, int hit);
	public int update(String id, int boardNum, String title, String content);
	public int delete(int boardNum);
	public ArrayList<BoardVO> select();
	public ArrayList<BoardVO> serch(String title);
	public ArrayList<BoardVO> read(int boardNum);
}
