import java.util.Scanner;
public class SumOddScores {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

		int score = 0;
		int sumoddindices = 0;
		int indices;

		for (indices = 1; indices <= 10; indices++) {
		System.out.printlnz("Enter a score: "+indices);
		score = scanner.nextInt();
		if (indices % 3 == 0) {
		sumoddindices =+ score;
		}
	}
		System.out.println("The sum of even numbers from 1 to 10 is: "+sumoddindices);
	
}
}
		

		
	
			
