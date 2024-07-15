import java.util.Scanner;
public class NumberChecker {
	
    	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

    
        boolean isEvenNumber = isEven(number);


        if (isEvenNumber) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

