package arrayDemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
	public static void main(String[] args) {
		List<Customer> allCustomers = new ArrayList<Customer>();
		Customer c1 = new Customer(10,"f","Pune",7600);
		allCustomers.add(c1);
		allCustomers.add(new Customer(11,"t","Agra",9800));
		allCustomers.add(new Customer(12,"j","Mumbai",7600));
		allCustomers.add(new Customer(13,"m","Bangalore",76000));
		allCustomers.add(new Customer(14,"a","Delhi",6600));
		for (Customer customer:allCustomers) {
			System.out.println(customer);
		}
		Collections.sort(allCustomers);
		System.out.println();
		for (Customer customer:allCustomers) {
			System.out.println(customer);
		}
		Collections.sort(allCustomers, new CustomerAddressComparator());
		System.out.println("after sorting via comparator");
		for (Customer customer:allCustomers) {
			System.out.println(customer);
		}
	}
}
