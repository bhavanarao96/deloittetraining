package IODemos;

import java.io.*;

public class CustomerMain {
	public static void main(String[] args) throws IOException {
		Customer customer = new Customer(122,"ff","blr",43000);
		FileOutputStream stream = new FileOutputStream("customer.txt");
		BufferedOutputStream bs = new BufferedOutputStream(stream);
		ObjectOutputStream ot = new ObjectOutputStream(bs);
		
		ot.writeObject(customer);
		System.out.println(customer);
		ot.close();
	}
}
