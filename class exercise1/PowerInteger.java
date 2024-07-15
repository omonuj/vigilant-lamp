import java.util.Scanner;

public class PowerInteger {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number1 = scanner.nextInt();

	System.out.print("Enter a number: ");
	int number2 = scanner.nextInt();

	int base = number2;
	int exponent = number1;

	int answer = exponent * base;

	System.out.println("The number raised to its power is: "+answer);
	}
}