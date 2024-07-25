import java.util.Arrays;

public class NumberOne{

	public static void main(String [] args) {

	int [] number = new int[10];
	
	for( int index = 0;index < number.length; index++){
		number[index] = index + 1;
		
	}
	double sum = 1+2+3+4+5+6+7+8+9+10;
	double average = sum / 10;
	
	System.out.println(Arrays.toString(number));
	System.out.println("The sum of all these numbers are: " + sum);
	System.out.println("The average of all these numbers are: " + average);
	

	}
}