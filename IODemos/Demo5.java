package IODemos;

import java.io.*;

public class Demo5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		File file = new File("C:\\mydata\\data.txt");
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		//FileWriter writer = new FileWriter(file);
		BufferedWriter w = 
				new BufferedWriter(new FileWriter(new File("C:\\mydata\\data.txt")));
		System.out.println("Enter name");
		String name = reader.readLine();
		System.out.println("Enter age");
		int age = Integer.parseInt(reader.readLine());
		System.out.println("Enter price");
		int price = Integer.parseInt(reader.readLine());
		
		FileOutputStream writer = new FileOutputStream("C:\\mydata\\data.txt");
		BufferedOutputStream bs = new BufferedOutputStream(writer);
		DataOutputStream ds = new DataOutputStream(bs);
		ds.writeUTF(name);
		ds.writeInt(age);
		ds.writeInt(price);
		ds.close();
		bs.close();
		//w.write(name);
		//w.write(age);
		//w.write(price);
		
		w.close();
		reader.close();
	}
}
