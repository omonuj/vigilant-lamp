import java.util.Scanner;

public class PrimeNumbers {
	

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       

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
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
