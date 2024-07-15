import java.util.Scanner;
public class CurrencyExchange
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the exchange rate to convert from dollars to RMB" );
		double rate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa" );
		double convert = input.nextDouble();

		System.out.print("Enter the dollar amount");
		double amount = input.nextDouble();

		if (user input == 0){
		convert from dollers to RMB;
		}
		else if(user input == 1){
		convert from RMB to dollars;

		double value = rate * amount;

		System.out.printf( rate);
	}
}

		