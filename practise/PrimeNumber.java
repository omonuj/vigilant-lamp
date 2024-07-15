import java.util.Scanner;
public class PrimeNumber {
	
    	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

    
        boolean isPrimeNumber = isPrime(number);


        if (isPrimeNumber) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
 
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;

        }
        for (int wow = 1; wow <= number; wow++) {
            if (number % wow == 0) {
                return false;
            }
        }
        return true;

	}
}
