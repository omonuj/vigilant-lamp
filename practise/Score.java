import java.util.Scanner;
public class Score {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	int counter;
	int score = 0;
	
	for (counter = 1; counter <= 10; counter++) {
	System.out.print("Enter a score: ");
	score = scanner.nextInt();
	
	if (counter == 7) {
	break;
	}
	}
	System.out.println("This is the value of counter: "+counter);
}
}