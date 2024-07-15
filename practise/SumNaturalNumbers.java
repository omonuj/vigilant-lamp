import java.util.Scanner;
public class SumNaturalNumbers {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
		
		int sum = 0;

		System.out.print("Enter number: ");
		int number = scanner.nextInt();

		for (number = 1; number <= 10; number++) {
			sum += number;	
		}
		System.out.println("The sum of first 10 natural numbers are: "+sum);
				
	}

}
