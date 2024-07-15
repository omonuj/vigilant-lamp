

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	int factorial = 1;
	
	System.out.print("Enter first number: ");
	int number = scanner.nextInt();

	for(int count = 1;count <= number; count++) {
		factorial *= count;
	}
	System.out.println(factorial);
	
}
}
		
