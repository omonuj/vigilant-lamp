import java.util.Scanner;

public class Multiplication {
    public static int product(int number1, int number2) {
        int result = 0;
        int positiveNumber1 = number1 < 0 ? -number1 : number1;
        int positiveNumber2 = number2 < 0 ? -number2 : number2;

        for (int zero = 0; zero < positiveNumber2; zero+/+) {
            result += positiveNumber1;
        }

        if ((number1 < 0 && number2 > 0) || (number1 > 0 && number2 < 0)) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int results = product(firstNumber, secondNumber);
        System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is: " + results);
    }
}
