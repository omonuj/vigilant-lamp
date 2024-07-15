import java.util.Scanner;
public class LargestSmallest{
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int first = scanner.nextInt();

	System.out.print("Enter second number: ");
	int second = scanner.nextInt();
	
	System.out.print("Enter third number: ");
	int third = scanner.nextInt();

	System.out.print("Enter forth number: ");
	int forth = scanner.nextInt();

	System.out.print("Enter fifth number: ");
	int fifth = scanner.nextInt();

	if (first > second && first > third && first > forth && first > fifth) {
		System.out.println("This "+first+", Is the largest number");
	}
	if (second > first && second > third && second > forth && second > fifth) {
		System.out.println("This "+second+", Is the largest number");
	}
	if (third > first && third > second && third > forth && third > fifth) {
		System.out.println("This "+third+", Is the largest number");
	}
	if (forth > first && forth > second && forth > third && forth > fifth) {
		System.out.println("This"+forth+", Is the largest number");
	}
	if (fifth > first && fifth > second && fifth > third && fifth > forth) {
		System.out.println("This "+fifth+",Is the largest number");
	}
	
	if (first < second && first < third && first < forth && first < fifth) {
		System.out.println("This "+first+", Is the smallest number");
	}
	if (second < first && second < third && second < forth && second < fifth) {
		System.out.println("This "+second+", Is the smallest number");
	}
	if (third < first && third < second && third < forth && third < fifth) {
		System.out.println("This "+third+", Is the smallest number");
	}
	if (forth < first && forth < second && forth < third && forth < fifth) {
		System.out.println("This "+forth+", Is the smallest number");
	}
	if (fifth < first && fifth < second && fifth < third && fifth < forth) {
		System.out.println("This "+fifth+", Is the smallest number");
	}

}
}	

	
	

	
	
