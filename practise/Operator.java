import java.util.Scanner;
public class Operator {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = scanner.nextInt();


	if (number % 5 == 0 && number % 3 == 0) {
		System.out.print("this number is divisible 5 and 3");
	
	}
}
}