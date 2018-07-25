package IODemos;

import java.io.File;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		File[] path;
		File file = new File("C:\\Batch\\BatchMates.txt"); //if file exists, it'll point to it
		File file2 = new File("C:\\Batch"); 
		if (file.exists()) {
			path = file2.listFiles();
			for(File p:path) {	
				if(p.isFile()) {
					System.out.println(p + " is a file");
				}
				else
					System.out.println(p + "is a directory");
	         }
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
