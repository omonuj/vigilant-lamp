//
using the Account constructor to initialize the name instance
variable at the time each Account object is created
//

public class AccountTest {
	public static void main(String [] args) {

	//create two Account objects
	Account account1 = new Account("Jonah Odoh");
	Account account2 = new Account("Omonu Odoh");

	//display initial value of name for each Account
	System.out.printf("account1 name is: %s%n", account1.getName());
	System.out.printf("account2 name is: %s%n", account2.getNmae());

	}

}