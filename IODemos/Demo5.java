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
		//writer.write("Name: "+name);
		System.out.println("Enter age");
		int age = Integer.parseInt(reader.readLine());
		//writer.write(" Age: "+age+"  \n");
		System.out.println("Enter price");
		int price = Integer.parseInt(reader.readLine());
		//writer.write("Price: "+price);
		w.write(name);
		w.write(age);
		w.write(price);
		
		w.close();
		reader.close();
	}
}
