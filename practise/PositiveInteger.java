import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("The number is not prime.");
        } else if (isPrime(number)) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }

        scanner.close();
    }

}
