import java.util.Scanner;
public class PositiveNegativeNumbers{
	public static void main(String [] args){

		Scanner scanner = new Scanner (System.in);

		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		int number = 0;

		while (number != -1) {
		System.out.print("Enter a number or Enter -1 to quit: ");
               		 number = scanner.nextInt();
		
		if (number > 0) {
 			positiveCount++;
         	} 
		else 
		if (number < 0) {
               		negativeCount++;
            	} 
		else
		{
                	zeroCount++;
           	}
 		}
		System.out.println("Count positive numbers: "+positiveCount);
       	 	System.out.println("Count negative numbers: "+negativeCount);
        	System.out.println("Count zeros: "+zeroCount);
		
	}
}