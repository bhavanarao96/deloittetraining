package IODemos;

import java.io.*;
import java.util.Properties;

public class Prop {
	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("C:\\mydata\\config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		String username= properties.getProperty("username");
		String password= properties.getProperty("password");
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		stream.close();
	}
}
