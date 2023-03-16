package api.util.collection;

import java.util.Vector;

//78,99,100,95,100 점을 Vector에 저장하고 저장된 점수들의 총점과 평균을 구해서 출력하기
public class VectorExam01 {
	public static void main(String[] args) {
		Vector<Integer> score = new Vector<Integer>();

//		score.add(0, 78);
//		score.add(1, 99);
//		score.add(2, 100);
//		score.add(3, 95);
//		score.add(4, 100);
		score.add(78);
		score.add(99);
		score.add(100);
		score.add(95);
		score.add(100);

		for (int i = 0; i < score.size(); i++) {
			int total = 0;
			int avg = 0;

			int data = score.get(i);
			total = total + data;
			avg = total / score.size();
			System.out.println(total);
			System.out.println(avg);
		}

	}

}
