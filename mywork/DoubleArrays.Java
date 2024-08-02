import java.util.Arrays;

public class DoubleArrays {

	public static void main(String [] args) {


	int[] firstArray = {2, 4, 6, 5};
	int doubleArrayLength = 0;
	int[] secondArray = doubleArrayLength(firstArray);

	System.out.println("first Array: " + Arrays.toString(firstArray));
	System.out.println("second Array: " + Arrays.toString(secondArray));

	}
	
	public static int[] doubleArraylength(int[] firstArray) {

	int[] secondArray = new int[2 * firstArray.length];

	for (int flat = 0; flat < firstArray.length; flat++) {
		secondArray[firstArray.length + flat] = 2 * firstArray[flat];
	}
	
	return secondArray;
    }
	

}