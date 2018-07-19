package inheritance;

public class PassengerMain {

	public static void main(String[] args) {
		Passenger p1= new Passenger(12,"ht",30);
		Passenger p2= new Passenger(12,"ht",30);
		Passenger p3= p1;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println("g".equals("G"));
	}

}
