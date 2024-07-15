import java.util.Scanner;
public class KeyPads{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("input a letter: ");
	String input = scanner.nextLine();

	if (input.lenth() != 1)   {
		System.out.println("Invalid input");
	}
	else{
		char letter = input.chatAt(0);
	}
	if (Character.isLetter(letter)) {
		int numericValue = Character.tolowercase(letter) - 'a' + 1;
		System.out.println("The numeric value for letter "   + letter + " is: " + numericValue);
	}
	else{
	System.out.println("invalid input");
	}

	}

}