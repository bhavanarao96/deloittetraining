package arrayDemos;

import java.util.*;

public class demo1 {
	
	public static void main(String[] args) {
		/*List<Integer> s = new LinkedList<Integer>(); 
		s.iterator();
		 System.out.println();
		for(Integer ii:s) {
			System.out.println(ii);
		}*/
		String s[] = {"m","n","o","p"};
		List<String> list = Arrays.asList(s);
		System.out.println(list);
		List<String> pp = new ArrayList();
		pp.addAll(list);
		pp.add(2,"r");
		System.out.println(pp);
	}
}
