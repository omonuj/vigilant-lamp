import java.util.Scanner;
public class CreditLimitCalculator {

	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);
	
	while (true) {
	System.out.print("Enter the account (or -1 to quit): ");
	int accountNumber = scanner.nextInt();
	if (accountNumber == -1) {
		break;
	}

	 System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Enter total charges this month: ");
            int totalCharges = scanner.nextInt();

            System.out.print("Enter total credits this month: ");
            int totalCredits = scanner.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = scanner.nextInt();

		int newBalance = beginningBalance + totalCharges - totalCredits;
       		 System.out.printf("New balance for account %d: %d%n", accountNumber, newBalance);

            	if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }
        }
    }
}
