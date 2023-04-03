package jdbc.exam.board;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardMenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.insert(id, title, content, 0);
		if(result > 0) {
			System.out.println("작성에  성공하였습니다.");
		}
		else {
			System.out.println("작성에 실패하였습니다.");
		}
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		System.out.println("제목수정: ");
		String title = key.next();
		System.out.println("내용수정:");
		String content = key.next();
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.update(id, boardNum, title, content);
		if(result > 0) {
			System.out.println("수정에 성공하였습니다..");
		}
		else {
			System.out.println("수정에 실패하였습니다.");
		}
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.delete(boardNum);
		if(result > 0) {
			System.out.println("삭제에 성공하였습니다..");
		}
		else {
			System.out.println("삭제에 실패하였습니다.");
		}
		
	}
	public void searchMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
		String title = key.next();
		//여기에서 BoardDAO의 메소드를 호출하세요
		ArrayList<BoardVO> boardlist = dao.serch(title);
		int size = boardlist.size();
		for (int i = 0; i < size; i++) {
			BoardVO board = boardlist.get(i);
			System.out.print(board.getBoardNum() + "\t");
			System.out.print(board.getId() + "\t");
			System.out.print(board.getTitle() + "\t");
		}
		
	}
	
	public void readMenu(){
		System.out.println("*******게시글상세조회********");
		System.out.print("글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		ArrayList<BoardVO> boardlist = dao.read(boardNum);
		int size = boardlist.size();
		for (int i = 0; i < size; i++) {
			BoardVO board = boardlist.get(i);
			System.out.print(board.getBoardNum() + "\t");
			System.out.print(board.getId() + "\t");
			System.out.print(board.getTitle() + "\t");
			System.out.print(board.getContent() + "\t");
			System.out.print(board.getRegdate() + "\t");
			System.out.println(board.getHit() + "\t");
		}
		
	}
	public void selectMenu(){
		System.out.println("*******게시글조회********");
		//여기에서 BoardDAO의 메소드를 호출하세요
		ArrayList<BoardVO> boardlist = dao.select();
		int size = boardlist.size();
		for (int i = 0; i < size; i++) {
			BoardVO board = boardlist.get(i);
			System.out.print(board.getBoardNum() + "\t");
			System.out.print(board.getId() + "\t");
			System.out.print(board.getTitle() + "\t");
			System.out.print(board.getContent() + "\t");
			System.out.print(board.getRegdate() + "\t");
			System.out.println(board.getHit() + "\t");
			
		}
	}
}


















