package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

	public static void main(String args[]) {

		Grade grade = new Grade();

		String fileName = "src/data/score.txt";
		grade.printGrade(fileName);
	}

	public void printGrade(String fileName) {
		/* 이곳에 프로그램을 완성하십시오. */
		int total = 0;
		int avg = 0;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			while (true) {
				String line = reader.readLine();
				if (line == null) { // line의 끝을 만나면
					break;
				}
				//문자열 분리
				String[] dataArr = line.split(",");
				total = total + Integer.parseInt(dataArr[1]);
				avg++;
				System.out.println(dataArr[0] + "의 점수는" + dataArr[1] + "점 입니다.");
				
			}
			System.out.println("총점: " + total);
			System.out.println("평균: " + (total/avg));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}