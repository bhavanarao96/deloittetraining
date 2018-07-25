package IODemos;

import java.io.*;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		//System.out.println(args[0]);
		File fileread = new File(args[1]);
		File filewrite = new File(args[2]);
		if (fileread.exists()) {
			if (filewrite.exists()) {
				filewrite.createNewFile();
			}
			FileReader reader = new FileReader(fileread);
			FileWriter writer = new FileWriter(filewrite);
			int i;
			while ((i=reader.read())!= -1)
			{
				writer.write((char)i);
			}
			reader.close();
			writer.close();
			System.out.println("File created.");
		}
		else {
			System.out.println("file does not exist");
			}
			
			
	}
}
