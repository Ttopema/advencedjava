package api.io;
//BufferedReader로 읽고 PrintWriter로 출력하기
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) {
		// src/data/InputStreamTest.java를 읽어서 파일을 copy하는 프로그램을 작성하라.
		// 1. 출력파일명: ouputs.txt
		// 2. 예외처리를 모두 적용하라.
		BufferedReader reader = null;
		PrintWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader(("src/data/InputStreamTest.java")));
			writer = new PrintWriter("src/data/output2.txt");

			String line = ""; // read메소드의 실행결과를 저장
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				writer.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
