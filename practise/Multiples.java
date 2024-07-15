import java.util.Scanner;
public class Multiples{
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter number1: ");
	int number1 = scanner.nextInt();
	
	System.out.print("Enter number2: ");
	int number2 = scanner.nextInt();

	int tripled = number1 * number1 * number1;
	int doubled = number2 * number2;

	if (tripled % doubled == 0) {
		System.out.println("the first number ("+tripled+") is a multiple of the second number ("+doubled+").");
	}
	else{
		System.out.println("the first number ("+tripled+") is not a multiple of the second number ("+doubled+").");
	}

}
}
