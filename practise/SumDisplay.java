import java.util.Scanner;
public class SumDisplay {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
			
			char choice;

		do {
			System.out.print("Enter the first number: ");
			int first = scanner.nextInt();
			
			System.out.print("Enter second number: ");
			int second = scanner.nextInt();

			int sum = first + second;

			System.out.println("The sum of "+first+" and "+second+" is: "+sum);

			System.out.print("Do you want to perform another addition? (y/n): ");
			choice = scanner.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');
			
			scanner.close();		
	}
}