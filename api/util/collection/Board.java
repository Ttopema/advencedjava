package api.util.collection;

import java.util.Date;

public class Board {
	private int num;
	private String writer;
	private String title;
	private Date date;
	private String detail;
	
	public Board() {
		
	}
	

	public Board(int num, String writer, String title, String detail) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.date = new Date();
		this.detail = detail;
	}

	
	@Override
	public String toString() {
		return "Board [num=" + num + ", writer=" + writer + ", title=" + title + ", date=" + date + ", detail=" + detail
				+ "]";
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
