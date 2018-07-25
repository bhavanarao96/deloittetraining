package threadDemos;
//create threads using anonymous class
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("main called"+Thread.currentThread().getName());
		Thread t1 = new Thread()
			{
				@Override
				public void run() {
					System.out.println("main called"+Thread.currentThread().getName());
				}
			};	
		t1.start();
	}
}
