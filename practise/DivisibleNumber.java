import java.util.Scanner;
public class DivisibleNumber{
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter number: ");
	int number = scanner.nextInt();

	if (number % 3 == 0) {
		System.out.println("This "+number+" is devisible by 3");
	}
	else{
		System.out.println("This "+number+" is not devisible by 3");
	}
}
}
	
	
	



	

	

	