package IODemos;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\mydata\\data.txt"); //if file exists, it'll point to it
		File file2 = new File("C:\\mydata"); 
		if (file.exists()) {
			
		}
		else {
			boolean result = file2.mkdirs();
			if (result) {
				file.createNewFile();
				System.out.println("File created");
			}
		}	
	}
}
