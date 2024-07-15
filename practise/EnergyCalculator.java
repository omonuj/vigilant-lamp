import java.util.Scanner;
public class EnergyCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter amount of water in kilogram");
		double waterKilogram = input.nextDouble();

		System.out.print("Enter initial temperature");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter final temperature");
		double finalTemperature = input.nextDouble();

		double energy = (finalTemperature - initialTemperature) * 4184 * waterKilogram;
		
		System.out.print(energy);
	}

}
