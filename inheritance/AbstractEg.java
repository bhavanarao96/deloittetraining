package inheritance;

abstract class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle");
	}
	public abstract void start();
	public abstract void stop();
	public void music() {
		System.out.println("Music");
	}
}
class Car extends Vehicle{
	public Car() {
		System.out.println("Car");
	}
	public void start() {
		System.out.println("Start");
	}
	public void stop() {
		System.out.println("Stop");
	}
}
public class AbstractEg {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.stop();
		v.music();
	}
}
