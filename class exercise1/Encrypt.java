import java.util.Scanner;

public class Encrypt {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a four_digits to encrypt(positive or negative): ");
	int number = scanner.nextInt();

	boolean isNegative = false;
	if (number < 0) {
	    isNegative = true;
	    number = -number;
	}
	//split numbers
	int digit1 = (number / 1000 + 7) % 10;
	int digit2 = (number / 100 % 10 + 7) % 10;
	int digit3 = (number / 10 % 10 + 7) % 10;
	int digit4 = (number % 10 + 7) % 10;

	int encryptedNumber = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2; 
	
	System.out.println("The encrypted number: " + (isNegative ? "-" : "") + encryptedNumber);

	}
}