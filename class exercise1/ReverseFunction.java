import java.util.Scanner;

public class ReverseFunction {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a five digits number: ");
	int number = scanner.nextInt();

	int digits = 0;
	int reversedNumber = 0;

	while (number != 0) {
		digits = number % 10;
		reversedNumber = reversedNumber * 10 + digits;
		number = number / 10;
	}
	System.out.println("Original number: 12345");
        System.out.println("Reversed number: " + reversedNumber);
}
}