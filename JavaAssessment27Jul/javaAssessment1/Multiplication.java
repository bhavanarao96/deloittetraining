package JavaAssessment27Jul.javaAssessment1;

public class Multiplication extends Arithmetic {

	public Multiplication() {
		super();
	}

	public Multiplication(double num1, double num2) {
		super(num1, num2); // initialization
	}

	@Override
	public double calculate(double num1, double num2) {
		
		return num1*num2; // return product of two numbers
	}

}
