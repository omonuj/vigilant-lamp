import java.util.Scanner;

public class MaximumFind {

	public static void main(String [] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter three floating numbers separated by spaces: ");
	double first = scanner.nextDouble();
	double second = scanner.nextDouble();
	double third = scanner.nextDouble();

	double result = maximum(first, second, third);

	System.out.println("The maximum number is: " + result);
}

	public static double maximum(double blue, double red, double green) {

	double maximumValue = blue;
	if ( red > maximumValue) {
		maximumValue = red;
	}
	if ( green > maximumValue) {
		maximumValue = green;
	}
	return maximumValue;

	
}

}