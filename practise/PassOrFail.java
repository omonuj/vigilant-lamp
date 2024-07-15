import java.util.Scanner;

public class PassOrFail{
		
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int score = 0;
		while (score != -1){
		System.out.print("Enter your score: ");
		score = input.nextInt();

		if (score != -1 &&  >= 60){
		System.out.println("You pass the Exam");
		}
		else if (score != -1 && score <= 59){
		System.out.println("you don't pass the Exam");
		}
		

	}

	}
}