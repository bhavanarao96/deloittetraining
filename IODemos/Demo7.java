package IODemos;

import java.io.*;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		File f = new File("c.txt");
		RandomAccessFile ra = new RandomAccessFile(f, "rw");
		ra.seek(ra.length());
		ra.writeUTF("hey today is wednesday");
		ra.seek(0);
		
		/*try {
			do {
				String n = ra.readUTF();
				System.out.println(n);
			} while (true);
		} catch (Exception e) {
			
		}*/
		ra.seek(2);
		byte[] bytes = new byte[12];
		ra.read(bytes);
		ra.close();
		System.out.println(new String(bytes));
		
		
	}
}
