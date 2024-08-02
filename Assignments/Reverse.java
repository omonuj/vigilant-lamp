import java.util.Arrays;

public class Reverse {

	public static void main(String [] args) {

	int [] numbers = {15, 20, 34, 45, 67,};
	int left = 0;
	int right = numbers.length -1;

	while (left < right) {
		int green = numbers[left];
		numbers[left] = numbers[right];
		numbers[right] = green;
		left++;
		right--;
	}
	
	for (int numb = 1;numb < numbers.length; numb++) {
		System.out.print(numb + " ");
	}
	
     }
}