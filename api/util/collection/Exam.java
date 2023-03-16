package api.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Exam {
	public static void main(String[] args) {
		CollectionExam col = new CollectionExam();
		
		Board b1 = new Board(1, "김태진", "11", "11"); //HashMap에서는 b1자체를 key또는 value 싸잡아서 하나로 인식하는 듯 하다.
		Board b2 = new Board(2, "박명준", "22", "22");
		Board b3 = new Board(3, "윤동진", "33", "33");
		Board b4 = new Board(4, "이감자", "44", "44");
		Board b5 = new Board(5, "김춘천", "55", "55");
		
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		col.arrayPrint(list);
		
		System.out.println("==========================================================================================");
		HashSet<Board> set = new HashSet<Board>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		col.setPrint(set);
		
		
		System.out.println("==========================================================================================");
		HashMap<String, Board> map = new HashMap<>();
		map.put(b1.getNum() + "", b1);
		map.put(b2.getNum() + "", b2);
		map.put(b3.getNum() + "", b3);
		map.put(b4.getNum() + "", b4);
		map.put(b5.getNum() + "", b5);
		
		col.mapPrint(map);
		
	}

}
