package JavaAssessment27Jul.javaAssessment2;

public class EmployeeBo {
	public void calincomeTax (EmployeeVo ev) {
		
		if(ev.getAnnualincome()<=250000)
		{
			ev.setIncometax(0);
		}
		else if(ev.getAnnualincome()>250000 && ev.getAnnualincome()<=500000)
		{
			ev.setIncometax(0.05*ev.getAnnualincome());
		}
		else if(ev.getAnnualincome()>500000 && ev.getAnnualincome()<=1000000)
		{
			ev.setIncometax(0.2*ev.getAnnualincome());
		}
		else
		{
			ev.setIncometax(0.3*ev.getAnnualincome());
		}
	}
}
