import java.util.Scanner;
public class ValueOfNumber {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int first = scanner.nextInt();

		System.out.print("Enter second number: ");
		int second = scanner.nextInt();

		int base = first;
		int exponent = second;
	
		int result = 1;
		for (int i = 0; i < exponent; i++) { 
			result *= base;
		}

		System.out.println("the "+base + " raised to the power of " + exponent + " is: " + result+" number");
	}

}