import java.util.Scanner;
public class NumberDisplay {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int number = 0;

		while (number != -1){
		System.out.print("Enter another number or Enter -1 to stop");	
			number = scanner.nextInt();
		if (number < min) {
			min = number;
		}
		if (number > max) {
			max = number;
		}
		}

		System.out.println("The smallest number is: " + min);
		System.out.println("The Largest number is: " + max);

		}

}