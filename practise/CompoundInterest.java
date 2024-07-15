import java.util.Scanner;
public class CompoundInterest{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter monthly saving amount: ");
		double amount = input.nextDouble();
		double percentage = 3.75 / 100 ;double month1 = percentage /12;
		
		
		double custermersInterst = (amount * (1 + month1));

		
		double month2 = custermersInterst + custermersInterst;
		double month3 = month2 + custermersInterst;
		double month4 = month3 + custermersInterst;
		double month5 = month4 + custermersInterst;
		double month6 = month5 + custermersInterst;
		
		

		for (int count = 1; count<=6; count++){
	 custermersInterst = (amount * (1 + month1)) * count;
		
	System.out.printf("After Month %d, The Account value is : %f%n", count,custermersInterst);
		
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("After Month 6 " + "The Account value is : "+ month6);
		
		

	}
}