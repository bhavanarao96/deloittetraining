import java.util.Scanner;

public class WeatherSystem {
	String unit;
	double temperature;
	double celsius;
	
	public WeatherSystem(String unit, double temperature) {
		this.unit=unit;
		this.temperature=temperature;
	}
	public double changeUnitsToCelsius (double temp) {
		return ((5.0/9.0)*(temp-32.0));
	}
	
	public void displayWarning(double celsius) {
		
		if (celsius > 60 || celsius<-10) {
			System.out.println("WARNING!");
		}
		else
			System.out.println("No warning.");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Temperature in (C/F)");
		String unit = in.nextLine();
		System.out.println("Enter temperature.");
		double temperature = in.nextDouble();
		double celsius = temperature;
		WeatherSystem w = new WeatherSystem(unit,temperature);
		if ((unit.toUpperCase()).equals("F")) {
			celsius = w.changeUnitsToCelsius(temperature);
		}
		System.out.println("Temperature in Celsius:"+celsius);
		w.displayWarning(celsius);
		in.close();
	}
}
