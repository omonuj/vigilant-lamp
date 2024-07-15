import java.util.Scanner;
public class Sum
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		int sum =0;
		System.out.print("Enter even number: ");
		int evenNumber = input.nextInt();
			
		System.outprint("Enter odd number: ");
		int oddNumber = input.nextInt();

		int counter = 0;
	
		for ( counter = 0; counter > 50; counter ++){

		if (counter %2== 0){
			sum + = counter;
		System.out.print(" sum " counter + " ");

		else
		System.out.print("odd" counter + " ");
		}
	}
}
	
		