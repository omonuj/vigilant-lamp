import java.util.Scanner;
public class Sum2 {

	public static void main(String [] args){
	
	int num1, num2, sum;
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter first number: ");
	num1 = scanner.nextInt();

	System.out.println("Enter second number");
	num2 = scanner.nextInt();

	scanner.close();
	sum = num1 + num2;
	System.out.println("Sum of these numbers is: "+sum);
	}
}