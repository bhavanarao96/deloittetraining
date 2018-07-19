package inheritance;

import java.util.Scanner;

public class Calculator {
	public int add(int x, int y) {
		return x+y;
	}
	public double add(double x, double y) {
		return x+y;
	}
	public double add(int x, double y) {
		return x+y;
	}
	public double add(double x, int y) {
		return x+y;
	}
	public int diff(int x, int y) {
		return x-y;
	}
	public double diff(double x, double y) {
		return x-y;
	}
	public double diff(int x, double y) {
		return x-y;
	}
	public double diff(double x, int y) {
		return x-y;
	}
	public int mul(int x, int y) {
		return x*y;
	}
	public double mul(double x, double y) {
		return x*y;
	}
	public double mul(int x, double y) {
		return x*y;
	}
	public double mul(double x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
	public double div(double x, double y) {
		return x/y;
	}
	public double div(int x, double y) {
		return x/y;
	}
	public double div(double x, int y) {
		return x/y;
	}
	public void display(int res) {
		System.out.println(res);
	}
	public void display(double res) {
		System.out.println(res);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter operation Add(A)/Subtract(S)/Multiply(M)/Divide(D)");
		String op = in.nextLine();
		System.out.println("Enter 2 numbers."); 
		double x = in.nextDouble();
		double y = in.nextDouble();
		if ((op.toUpperCase()).equals("A")) {
			c.display(c.add(x,y));
		}
		if ((op.toUpperCase()).equals("S")) {
			c.display(c.diff(x,y));
		}
		if ((op.toUpperCase()).equals("M")) {
			c.display(c.mul(x,y));
		}
		if ((op.toUpperCase()).equals("D")) {
			c.display(c.div(x,y));
		}
		else
			System.out.println("Try again. Enter A/S/D/M");
		in.close();
	}
}
