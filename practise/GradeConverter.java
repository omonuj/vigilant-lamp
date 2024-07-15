import java.util.Scanner;
public class GradeConverter{

	public static void main(String [] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter alphabet to grade: ");
	String input = scanner.nextLine();

	int numericValue;
	switch (input) {
	case "A":
		numericValue = 4;
		break;
	case "B":
		numericValue = 3;
		break;
	case "C":
		numericValue = 2;
		break;
	case "D":
		numericValue = 1;
		break;
	case "F":
		numericValue = 0;
		break;
	default:
		numericValue = 5;
	}
	if (numericValue == (5)) {
		System.out.println("invalid grade");
	}
	else{
		System.out.println("The numeric value for grade "  + input + " is: " + numericValue);

	}

	}
}