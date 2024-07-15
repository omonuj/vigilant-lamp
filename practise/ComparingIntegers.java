import java.util.Scanner;
public class ComparingIntegers {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter one number: ");
	double number = scanner.nextDouble();

	double numberSquare = number * number;

	if (numberSquare > 100) {
		System.out.println("This "+numberSquare+", is greater than 100");
	}
	if (numberSquare == 100) {
		System.out.println("This "+numberSquare+", is equal to 100");
	}
	if (numberSquare != 100) {
		System.out.println("This "+numberSquare+", is not equal to 100");
	}
	if (numberSquare < 100) {
		System.out.println("This "+numberSquare+", is less than 100");
	}
}
}
