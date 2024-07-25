import java.util.Arrays;

public class SquareArray {

	public static void main(String [] args) {

	int [] number = {2, 6, 7, -9, -77, -8, 76};

	for(int digit = 0;digit < number.length; digit++) {
		number[digit] = number[digit] * number[digit];											
	}

	
	System.out.println(Arrays.toString(number));

     }
}


