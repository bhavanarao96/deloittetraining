package IODemos;

import java.io.*;

public class Demo6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		File file = new File("C:\\mydata\\data.txt"); 
		InputStreamReader stream =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(stream);
		System.out.println("Enter name");
		String name = br.readLine();
		
		
	}
}
