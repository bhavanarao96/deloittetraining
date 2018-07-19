package deloitte;


public class Proj {
	public void disp() {
		System.out.println("null");
	}
	public void disp(int m, int n) {
		System.out.println("2");
	}
	public void disp(int...m) {
		System.out.println("many");
	}
	public static void main(String[] args) {
		
		System.out.println("deloitte proj");
		Proj p = new Proj();
		p.disp(1,5,4,3);
	}
}
