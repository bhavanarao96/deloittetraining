package JavaAssessment27Jul.javaAssessment1;

public class Subtraction extends Arithmetic {

	public Subtraction() {
		super();
	}

	public Subtraction(double num1, double num2) {
		super(num1, num2); //initialization
	}

	@Override
	public double calculate(double num1, double num2) {
		return num1-num2; //return difference between two numbers
	}

}
