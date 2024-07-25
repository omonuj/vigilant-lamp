import java.util.Scanner;

public class Decrypt {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter an encrypted four-digit integer to decrypt(positive or negative): ");
	String input = scanner.nextLine();
	
	boolean isNegative = false;
	int number;
	if (input.startsWith("-")) {
	   isNegative = true;
	   number = Integer.parseInt(input.substring(1));
	}
	else {
	   number =Integer.parseInt(input);
	}	

	//split numbers
	int digit1 = (number / 1000 - 7 + 10) % 10;
	int digit2 = ((number / 100) % 10 - 7 + 10) % 10; 
	int digit3 = ((number / 10) % 10 - 7 + 10) % 10;
	int digit4 = (number % 10 - 7 + 10) % 10;

	String decryptedNumber = (digit3 == 0 ? "0" : "") + digit4 + "" + digit1 + "" + digit2;


	
	System.out.println("The decrypted number: " + (isNegative ? "-" : "") + decryptedNumber);

	}

}


