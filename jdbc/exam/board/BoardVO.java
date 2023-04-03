package jdbc.exam.board;

import java.sql.Date;

public class BoardVO {
	private int boardNum;
	private String id;
	private String title;
	private String content;
	private Date regdate;
	private int hit;

	public BoardVO() {

	}

	public BoardVO(String id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;

	}

	// select

	@Override
	public String toString() {
		return "BoradVO [boardNum=" + boardNum + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + ", hit=" + hit + "]";
	}

	public BoardVO(int boardNum, String id, String title, String content, Date regdate, int hit) {
		this(id, title, content);
		this.boardNum = boardNum;
		this.regdate = regdate;
		this.hit = hit;
	}

	// serch
	
	public BoardVO(int boardNum, String id, String title) {
		this.boardNum = boardNum;
		this.id = id;
		this.title = title;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

}
