package JavaAssessment27Jul.javaAssessment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("Enter the number of employees.");
		Scanner in = new Scanner(System.in);
		int noOfEmp = in.nextInt();
		int empid;
	    	String empName;
	    	double annualincome;
		EmployeeBo eb = new EmployeeBo();
		List<EmployeeVo> employees = new ArrayList<EmployeeVo>();

		for(int i=1; i<=noOfEmp; i++) {
			System.out.println("Enter details of Employee "+i);
			System.out.println("Enter EmpID :");
		    	empid = in.nextInt();
			System.out.println("Enter Employee Name : ");
            		empName = in.next();
		        System.out.println("Enter Annual Income :");
        		annualincome = in.nextDouble();
	
		        employees.add(new EmployeeVo(empid, empName, annualincome)); // add into list
	               	eb.calincomeTax(employees.get(i-1)); //calculate income tax
		}
		
		System.out.println("Employee details: ");
		for (EmployeeVo ee:employees) {
			System.out.println(ee);
		}

		Collections.sort(employees, new Employeesort()); //sort in descending order of income tax
		System.out.println("Employee details after sorting: ");
		for (EmployeeVo ee:employees) {
			System.out.println(ee);
		}
		in.close();
	}
}