package collectionDemos;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		TreeMap<String, Double> map = new TreeMap<String, Double>();
		map.put("d",new Double(3.2));
		map.put("a",new Double(4.6));
		map.put("w",new Double(2.7));
		map.put("l",new Double(8.2));
		System.out.println(map);
		
		Set set= map.entrySet(); //to convert map into set because you cannot iterate directly with maps
		
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry me =(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		double balance = ((Double)map.get("d")).doubleValue();
		map.put("d", new Double (balance+1000));
		System.out.println("new balance "+map.get("d"));
	}
}
