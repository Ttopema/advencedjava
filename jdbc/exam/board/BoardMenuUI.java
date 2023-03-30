package jdbc.exam.board;
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
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.update(id, boardNum, id, id);
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
	}
	
	public void readMenu(){
		System.out.println("*******게시글상세조회********");
		System.out.print("글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		
	}
	public void selectMenu(){
		System.out.println("*******게시글조회********");
		//여기에서 BoardDAO의 메소드를 호출하세요
		
	}
}


















