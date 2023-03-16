package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		// src/data/InputStreamTest.java를 읽어서 파일을 copy하는 프로그램을 작성하라.
		// 1. 출력파일명: ouput.txt
		// 2. 예외처리를 모두 적용하라.
		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader("src/data/InputStreamTest.java");
			writer = new FileWriter("src/data/output.txt");

			int data = 0; // read메소드의 실행결과를 저장
			while ((data = reader.read()) != -1) {
				writer.write(data);
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
