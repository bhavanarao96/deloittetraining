package collectionDemos;

public class GenericDemo<Z,E> {
	public void display(Z name,E n) {
		System.out.println(name+""+n);
	}
	public static void main(String[] args) {
		GenericDemo<Double, Integer> d= new GenericDemo<Double,Integer>();
		d.display(132.5,90);
		//GenericDemo<String> dd= new GenericDemo<String>();
		//dd.display("hi");
	}
}
