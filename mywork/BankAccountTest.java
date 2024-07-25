import java.util..Scanner;

public class AccountTest {
	public static void main(String [] args) {
	Account account1 = new Account("Jonah Odoh", 50.00);
	Account account2 = new Account("Omonu Odoh", -7.53);

	System.out.printf("%s balance: $ %n",  account1.getName(), ); 
	System.out.printf("%s balance: $ %n%n", account2.getName(), ); 

	Scanner input = new Scanner(System.in);

	System.out.print("Enter deposit amount for account1: ");
	double depositAmount = input.nextDouble();
	System.out.printf("%n adding to account1 balance%n%n", depositAmount);
	account1.deposit(depositAmmount);


	System.out.printf("%s balance: $ %n",account1.getName(),); 
	System.out.printf("%s balance: $ %n%n",account2.getName(),);

	System.out.print("Enter deposit amount for account2: "); 
	depositAmount = input.nextDouble();
	System.out.printf("%nadding to account2 balance%n%n", depositAmount);
	account2.deposit(depositAmount);

	System.out.printf("%s balance: $ %n", 
	account1.getName(), ); 
	System.out.printf("%s balance: $ %n%n", account2.getName(),
	account2.getName(), account.getBalance());

	}
}