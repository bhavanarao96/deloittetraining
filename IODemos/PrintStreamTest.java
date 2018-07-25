package IODemos;

import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args) {
		PrintStream pout = new PrintStream(System.out);
		pout.println(1900);
		pout.println("hi");
		pout.println("java");
		pout.close();
	}
}
