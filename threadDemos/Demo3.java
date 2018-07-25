package threadDemos;

public class Demo3 extends Thread{
	public Demo3(int i ) {
		super(i+"");
		start();
	}
	@Override
	public void run() {
		System.out.println("run called:"+ Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			new Demo3(i);
		}
	}
}
