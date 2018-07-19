
public class Customer {
	int custId;
	String custName;
	int bill;
	
	public Customer() {
		custId=0;
		custName="NA";
		bill=100;
	}
	
	public Customer(int custId, String custName, int bill) {
		this.custId = custId;
		this.custName = custName;
		this.bill = bill;
	}
	public void display() {
		System.out.println("ID:" + custId);
		System.out.println("Name:" + custName);
		System.out.println("Bill:" + bill);
		
	}
	public static void main(String[] args) {
		input();
		Customer customer = new Customer(1,"ff",100);
		
		
	}

	public static void input() {
		int a=0,b=0;
		int result = a+b;
		System.out.println(result);
	}
	
}
