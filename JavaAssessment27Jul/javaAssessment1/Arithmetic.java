package JavaAssessment27Jul.javaAssessment1;

public abstract class Arithmetic {
	double num1, num2;
	public Arithmetic() {}
	public Arithmetic(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	//abstract method implemented in child classes
	public abstract double calculate(double num1, double num2);
	
}
