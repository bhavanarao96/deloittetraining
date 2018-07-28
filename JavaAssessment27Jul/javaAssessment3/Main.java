package JavaAssessment27Jul.javaAssessment3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s="null";
		System.out.println("Enter the integer array.");
		int arraylength=in.nextInt();
		int[] a = new int[arraylength];
		for(int i=0;i<arraylength;i++)
			a[i]=in.nextInt();
		if(UserMainCode.checkTripplets(a))
			s="TRUE";
		else
			s="FALSE";
		System.out.println(s);
		in.close();
	}
}
