import java.util.Scanner;

public class EvenOdd {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	int sumEven = 0;
	int sumOdd = 0;

	System.out.print("Enter a number: ");
	for(int count = 0;count <= 10; count++) {
	int number = scanner.nextInt();
	
	if (number % 2 == 0) {
	sumEven += number;
	}
	else {
	sumOdd += number;
	}
	 
	}


	System.out.println("The even numbers are: "+sumEven);
	System.out.println("The odd numbers are: "+sumOdd);

	}
}
	
	
