import java.util.Scanner;

public class AutomatedTellerMachine {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        String[] accounts = new String[100];
        String[] pins = new String[100];
        double[] balances = new double[100];
        int accountCount = 0;


        while (true) {
            System.out.println("""
		ATM Main Menu:
            	1. Create Account
            	2. Close Account
        	3. Deposit Money
            	4. Withdraw Money
            	5. Check Balance
           	6. Change PIN
		7. Transfer money
            	8. Exit
            	Choose an option
""");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scanner.nextLine();

                String accountId = firstName + lastName;

                boolean exists = false;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(accountId)) {
                        exists = true;
                 
                    }
                }

                if (exists) {
                    System.out.println("Account already exists.");
                } else {
                    accounts[accountCount] = accountId;
                    pins[accountCount] = pin;
                    balances[accountCount] = 0.0;
                    accountCount++;
                    System.out.println("Account created successfully.");
                    System.out.println("Account ID: " + accountId);
                    System.out.println("PIN: " + pin);
                }

            } else if (choice.equals("2")) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scanner.nextLine();

                String accountId = firstName + lastName;

                boolean found = false;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(accountId) && pins[index].equals(pin)) {
                        for (int current = 0; current < accountCount - 1; current++) {
                            accounts[current] = accounts[current + 1];
                            pins[current] = pins[current + 1];
                            balances[current] = balances[current + 1];
                        }
                        accountCount--;
                        found = true;
                        System.out.println("Account closed successfully.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid account details.");
                }

            } else if (choice.equals("3")) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scanner.nextLine();

                String accountId = firstName + lastName;

                boolean found = false;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(accountId) && pins[index].equals(pin)) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); 
                        balances[index] += amount;
                        found = true;
                        System.out.println("Deposit successful. New balance: #" + balances[index]);
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid account details.");
                }

            } else if (choice.equals("4")) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scanner.nextLine();

                String accountId = firstName + lastName;

                boolean found = false;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(accountId) && pins[index].equals(pin)) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        if (amount <= balances[index]) {
                            balances[index] -= amount;
                            found = true;
                            System.out.println("Withdrawal successful. New balance: #" + balances[index]);
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid account details.");
                }

            } else if (choice.equals("5")) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scanner.nextLine();

                String accountId = firstName + lastName;

                boolean found = false;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(accountId) && pins[index].equals(pin)) {
                        System.out.println("Current balance: #" + balances[index]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid account details.");
                }

            } else if (choice.equals("6")) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter current PIN: ");
                String pin = scanner.nextLine();

                String accountId = firstName + lastName;

                boolean found = false;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(accountId) && pins[index].equals(pin)) {
                        System.out.print("Enter new PIN: ");
                        String newPin = scanner.nextLine();
                        pins[index] = newPin;
                        found = true;
                        System.out.println("PIN changed successfully.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid account details.");
                }

	    	 } else if (choice.equals("7")) {
                System.out.print("Enter sender's first name: ");
                String senderFirstName = scanner.nextLine();
                System.out.print("Enter sender's last name: ");
                String senderLastName = scanner.nextLine();
                System.out.print("Enter sender's PIN: ");
                String senderPin = scanner.nextLine();

                String senderAccountId = senderFirstName + senderLastName;

                boolean senderFound = false;
                int senderIndex = -1;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(senderAccountId) && pins[index].equals(senderPin)) {
                        senderFound = true;
                        senderIndex = index;
                        break;
                    }
                }

                if (!senderFound) {
                    System.out.println("Invalid sender's account details.");
                    continue;
                }

                System.out.print("Enter receiver's first name: ");
                String receiverFirstName = scanner.nextLine();
                System.out.print("Enter receiver's last name: ");
                String receiverLastName = scanner.nextLine();

                String receiverAccountId = receiverFirstName + receiverLastName;

                boolean receiverFound = false;
                int receiverIndex = -1;
                for (int index = 0; index < accountCount; index++) {
                    if (accounts[index].equals(receiverAccountId)) {
                        receiverFound = true;
                        receiverIndex = index;
                        break;
                    }
                }

                if (!receiverFound) {
                    System.out.println("Invalid receiver's account details.");
                    continue;
                }

                System.out.print("Enter amount to transfer: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                if (amount <= balances[senderIndex]) {
                    balances[senderIndex] -= amount;
                    balances[receiverIndex] += amount;
                    System.out.println("Transfer successful. New balance for sender: #" + balances[senderIndex]);
                } else {
                    System.out.println("Insufficient balance in sender's account.");
                }		

            } else if (choice.equals("8")) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}