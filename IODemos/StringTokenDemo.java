package IODemos;

import java.util.*;

public class StringTokenDemo {
	public static void main(String[] args) {
		/*
		String value = "an apple a day keeps the doc away";
		StringTokenizer tokenizer = new StringTokenizer(value, "a");
		System.out.println(tokenizer.countTokens());
		Random random = new Random();
		System.out.println(random.nextInt(10)+10);
		Date d= new Date(1000*60);
		System.out.println(d);
		*/
		Properties p = System.getProperties();
		Enumeration<Object> e = p.elements();
		while(e.hasMoreElements()) {
			System.out.println("the value is"+ e.nextElement());
		}
	}
}
