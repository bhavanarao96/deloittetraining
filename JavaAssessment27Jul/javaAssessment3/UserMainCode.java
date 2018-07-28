package JavaAssessment27Jul.javaAssessment3;

public class UserMainCode {
	static boolean checkTripplets(int[] a)
 	{
		int length = a.length;
		for(int i=0;i<length;i++)
		{
			if(i==(length-2)) 
				break;
			if((a[i]==a[i+1])&&(a[i]==a[i+2])) // check if consecutive numbers are same
				return true;
		}
		return false;
 	}
}
