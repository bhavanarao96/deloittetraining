package JavaAssessment27Jul.javaAssessment1;

public class Division extends Arithmetic {

	public Division() {
		super();
	}

	public Division(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double calculate(double num1, double num2) {
		return num1/num2; // written division of the two numbers
	}

}
