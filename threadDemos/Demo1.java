package threadDemos;

public class Demo1 extends Thread{
	Thread t1;
	public Demo1() {
		t1= new Thread(this);
		t1.start();
		System.out.println("t1 started");
	}
	@Override
	public void run() {
		System.out.println("run called:"+ Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println("main:"+Thread.currentThread().getName());
	}
}
