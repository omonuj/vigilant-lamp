import java.util.Scanner;

public class PrimeNumbers {
	

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int wow = 2; wow <= Math.sqrt(number); wow++) {
            if (number % wow == 0) {
                return false;
            }
        }
        return true;
    }
}
