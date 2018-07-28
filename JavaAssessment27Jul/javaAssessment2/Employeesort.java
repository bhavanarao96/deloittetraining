package JavaAssessment27Jul.javaAssessment2;

import java.util.Comparator;

public class Employeesort implements Comparator<EmployeeVo>{

	@Override
	public int compare(EmployeeVo e1, EmployeeVo e2) {
		if (e1.getAnnualincome()>(e2.getAnnualincome()))
			return -1;
		else
			return 1;
	}
	

}
