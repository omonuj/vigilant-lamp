import java.util.Scanner;
public class CalculateEnergy{

	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water in kilogram: ");
	double amount = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature: ");
	double finalTemperature = input.nextDouble();

	double energy = finalTemperature - initialTemperature;
	double formula = energy * 4184;
	double weight = amount * formula;

	System.out.printf("The energy needed is %f", weight);
	}
}