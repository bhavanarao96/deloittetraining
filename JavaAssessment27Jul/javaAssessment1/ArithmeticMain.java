package JavaAssessment27Jul.javaAssessment1;

import java.util.Scanner;

public class ArithmeticMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
		System.out.println("Enter your choice: ");
		int choice = in.nextInt();
		System.out.println("Enter 2 numbers."); 
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		Arithmetic[] a = new Arithmetic[4]; // array of arithmetic objects
		a[0] = new Addition(num1,num2);
		a[1] = new Subtraction(num1,num2);
		a[2] = new Multiplication(num1,num2);
		a[3] = new Division(num1,num2);
		try {
		System.out.println("The result is " + a[choice-1].calculate(num1, num2));	
		}	
		catch(ArrayIndexOutOfBoundsException e) { // display error message if user enters other numbers
			System.out.println("Enter only 1/2/3/4.");
			System.out.println("Addition(1)/Subtracttion(2)/Multiplication(3)/Division(4).");
			System.out.println("Try again.");
		}
		in.close();
	}
	
}
