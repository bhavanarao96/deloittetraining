package exceptionDemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassUsingUserDefEx {
	public void display() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age-");
		int age=0;
		try {
			age= in.nextInt();
			if (age<0 || age>120) 
				throw new InvalidAgeException("Enter valid age");
		} 
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("your age is "+ age);
	}
	
	public static void main(String[] args) {
		ClassUsingUserDefEx c = new ClassUsingUserDefEx();
		c.display();
	}
}

