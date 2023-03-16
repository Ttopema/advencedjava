package api.io;

//화면에 출력을 하는것이기 때문에 
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream("src/data/p_out.txt");
		ps.println(3);
		ps.close();
	}

}
