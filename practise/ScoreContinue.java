import java.util.Scanner;
public class ScoreContinue {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	int counter;
	int score = 0;
	
	for (counter = 1; counter <= 10; counter++) {
	System.out.print("Enter a score: ");
	score = scanner.nextInt();
	
	if (counter == 5) {
	continue;
	}
	}
	System.out.println("This is the value of counter: "+counter);
}
}