public class LargestMain {
	
	public static void main(String [] args) {

	int [] numbers = {4, 34, 65, 89, 90, 91};
	int largest = findLargestElement(numbers);
	System.out.println("The largest number is: " + largest);

	}
	
	public static int findLargestElement(int [] random) {

		if (random.length == 0) {
			throw new RuntimeException("Array is empty");
	}
	int largest = random[0];
	for (int numb = 1;numb < random.length; numb++) {
		if (random[numb] > largest)  {
			largest = random[numb];
		}
	}
	return largest;	
    }
}