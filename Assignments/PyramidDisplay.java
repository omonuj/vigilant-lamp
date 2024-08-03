import java.util.Scanner;

public class PyramidDisplay {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	int rows = 0;

	do {
	    System.out.print("Enter an integer from 1 to 13: ");
	    while (!scanner.hasNextInt()) {
	 	System.out.println("This is not a valid number!");
		scanner.next();
	    }
	    rows = scanner.nextInt();
	} while (rows < 1 || rows > 13);

	for (int counter = 1; counter <= rows; counter++) {
		
		for (int index = rows - counter; index > 0; index--) {
			System.out.print("  ");
		}
		
		for (int index = counter; index >= 1; index--) {
			System.out.print(index + " ");
		}

		for (int index = 2; index <= counter; index++) {
			System.out.print(index + " ");
		}
		
		System.out.println( );
	    }
	

	}
}
			
	