package exceptionDemos;

public class Demo1 {
	String name;
	int num=10;
	int i=100;
	public void display() {	
		i++;
		try {			
		if (num==10)
			return;
		System.out.println(name.length());
		
		}
		
		catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("null ex");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("ex");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("ll");
		
	}
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.display();
		System.out.println("LAST");
	}
}
