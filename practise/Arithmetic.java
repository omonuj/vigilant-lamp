import java.util.Scanner;
public class Arithmetic {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int number1 = scanner.nextInt();

	System.out.print("Enter second number: ");
	int number2 = scanner.nextInt();

	int square = number1 * number1;
	int square2 = number2 * number2;
	int sum = square + square2;
	int difference = square - square2;

	System.out.println("The Square of number1 is: "+square+"\n The Square of number2 is: "+square2+"\n The Sum of integer is: "+sum+"\n The Diefference is: "+difference+");

	}
}