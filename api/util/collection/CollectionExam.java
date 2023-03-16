package api.util.collection;

import java.util.Collection;
//import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExam {

//	ArrayList<Board> list = new ArrayList<Board>();
//	HashSet<Board> set = new HashSet<Board>();
//	HashMap<Board, Board> map = new HashMap<Board, Board>();

	public static void arrayPrint(List<Board> list) {
		for (Board board : list) {
			boardInfo(board);
		}
		System.out.println();
	}

	public static void setPrint(Set<Board> set) {
		for (Board board : set) {
			boardInfo(board);
		}
		System.out.println();
	}
	
	public void printCollection(Collection<Board> col) {
		for (Board board : col) {
			boardInfo(board);
		}
		System.out.println("=====================");
	}

	public static void mapPrint(Map<String, Board> map) {
		for (String key : map.keySet()) {
			Board board = map.get(key);
			boardInfo(board);
		}
	}
	public static void boardInfo(Board board) {
		System.out.print(board.getNum() + "\n");
		System.out.print(board.getWriter() + "\n");
		System.out.print(board.getTitle() + "\n");
		System.out.print(board.getDetail() + "\n");
		System.out.println(board.getDate() + "\n");
	}
}