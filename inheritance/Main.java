package inheritance;


class Animal{
	int age=100;
	public Animal() {
		System.out.println("Animal"+age);
	}
	public void eat() {
		System.out.println("Animal eat");
	}
}
class Men extends Animal{
	int age=90;
	public Men() {
		System.out.println("Men"+age);
	}
	public void eat() {
		
		System.out.println("Men eat");
	}
	public void drink() {
		System.out.println("Men drink");
	}
}
class Dog extends Animal{
	int age=90;
	public Dog() {
		System.out.println("Dog"+age);
	}
	public void eat() {
		super.eat();
		System.out.println("Dog eat");
	}
	public void drink() {
		System.out.println("Dog drink");
	}
}
public class Main {
	public static void main(String[] args) {
		Animal m =new Men();
		m.eat();
		//m.drink();
		m =new Dog();
		m.eat();
		//m.drink();
	}
}
