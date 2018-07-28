package JavaAssessment27Jul.javaAssessment1;

public class Addition extends Arithmetic {

	public Addition() {
		super();
	}

	public Addition(double num1, double num2) {
		super(num1, num2); // initialisation
	}

	@Override
	public double calculate(double num1, double num2) {
		return num1+num2; // return sum of two numbers
	}

}
