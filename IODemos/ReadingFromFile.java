package IODemos;

import java.io.*;

public class ReadingFromFile {
	public static void main(String[] args) throws IOException {
		String n;
		int p = 0;
		int q=0;
		DataInputStream stream = 
				new DataInputStream(new BufferedInputStream(
						new FileInputStream(
								new File("C:\\mydata\\data.txt"))));
		n = stream.readUTF();
		p = stream.readInt();
		q = stream.readInt();
		System.out.println(n+" " + p +" "+q + " ");
	}
}
