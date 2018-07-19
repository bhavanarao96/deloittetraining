import deloitte.Proj;

public class Hello {
	int n=100;
	
	public int add(int num1, int num2) {
		return (num1+num2);
	}
	public static void main(String[] args) {
		Hello hello = new Hello();
		int sum = hello.add(13, 3);
		System.out.println(sum);
	}
	
}
class How
{
	public void hi() {
		System.out.println("how");
	}
	public static void main(String[] args) {
		System.out.println("how main");
	
	}
}
