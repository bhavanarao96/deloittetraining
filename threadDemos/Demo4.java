package threadDemos;
class Print {
	public synchronized static void printsomething(String n1, String n2) {
		System.out.println("Welcome,"+n1);
		System.out.println("bye,"+n2);
	}
}
public class Demo4 extends Thread{
	private String n1,n2;
	public Demo4(int i,String n1, String n2) {
		super(i+"");
		this.n1=n1;
		this.n2=n2;
		start();
	}
	@Override
	public void run() {
		//System.out.println("run called:"+ Thread.currentThread().getName());
		Print.printsomething(n1,n2);
	}
	public static void main(String[] args) {
		new Demo4(1,"meena","rao");
		new Demo4(1,"jiju","singh");
		new Demo4(1,"sneha","mehta");
		
	}
}
