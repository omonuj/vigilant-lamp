import java.util.Scanner;
public class PrintSomeNumbers {

	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter number: ");
	 int number = scanner.nextInt();
	
	if (number == 1) {
		System.out.print("ONE");
	}
	else if (number == 2) {
		System.out.print("TWO");
	}
	else if (number == 3) {
		System.out.print("THREE");
	}
	else if (number == 4) {
		System.out.print("FOUR");
	}
	else if (number == 5) {
		System.out.print("FIVE");
	}
	else if (number == 6) {
		System.out.print("SIX");
	}
	else if (number == 7) {
		System.out.print("SEVEN");
	}
	else if (number == 8) {
		System.out.print("EIGHT");
	}
	else if (number == 9) {
		System.out.print("NINE");
	}
	else if (number == 10) {
		System.out.print("TEN");
	}
	 else {
		System.out.println("invalid ");
	}


	}

}