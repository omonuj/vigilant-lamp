import java.util.Scanner;
public class FactorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        System.out.println("Factors of " + number + ":");
        int count = 0;
        for (int zero = 2; zero <= number; zero++) {
            if (number % zero == 0) { 
                System.out.println(zero);
                count++;
            }
        }

        System.out.println("The number of factors is: " + count);
    }
}
