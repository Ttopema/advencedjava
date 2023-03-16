package api.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2 {
	public static void main(String[] args) {

		Prob2 p2 = new Prob2();
		p2.printScore("src/data/data2.txt");
	}

	public void printScore(String fileName) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String title = reader.readLine();
			String [] strarr = title.split("/");
			System.out.println(strarr[0] + "\t" + strarr[1] + "\t" + strarr[2] + "\t" + strarr[3] + "\t총점");
			int total = 0;
			while (true) {
				String line = reader.readLine();
				if (line == null) { // 문자열의 끝.
					break;
				}
				String[] strarr2 = line.split("/");
				total = Integer.parseInt(strarr2[1]) + Integer.parseInt(strarr2[2]) + Integer.parseInt(strarr2[3]); 
				System.out.println(strarr2[0] + "\t" + strarr2[1] + "\t" + strarr2[2] + "\t" + strarr2[3] + "\t" + total);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
