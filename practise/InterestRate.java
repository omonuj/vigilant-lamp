import java.util.Scanner;
public class InterestRate
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter balance: ");
		double balance = input.nextDouble();

		System.out.print("Enter annuallrate: ");
		double annuallRate = input.nextDouble();

		double money = annuallRate / 1200;
		double interest = balance * money;
		System.out.printf("The interest is %f", interest);
	}
}

