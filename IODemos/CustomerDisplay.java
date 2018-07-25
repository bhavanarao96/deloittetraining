package IODemos;

import java.io.*;

public class CustomerDisplay {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream stream = new FileInputStream("customer.txt");
		BufferedInputStream bs = new BufferedInputStream(stream);
		ObjectInputStream ot = new ObjectInputStream(bs);
		
		Customer c = (Customer) ot.readObject();
		System.out.println(c);
		ot.close();
	
	}
}
