import java.util.Scanner;
public class Convertion{

	public static void main(String [] args){

	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter feet value");
	double feetValue = input.nextDouble();

	double meter = feetValue * 0.305;
	System.out.print(meter);
	}
}