public class SumDoWhileLoop {

	public static int sumNumbers(int [] arr) {
	
	int total = 0;
	int index = 0;

	if (arr.length > 0) {
	   do {
		total += arr[index];
		index++;
	  } while(index < arr.length);
	}
	return total;
    	}
	
	public static void main(String [] args) {
		
		int [] array = {20, 34, 45, 56, 54, 78, 78};

		System.out.print("Original list: ");
	
		for (int index : array) {
			System.out.print(index + " ");
		}

		System.out.println();


		sumNumbers(array);
		System.out.println("Sum using do-while loop: " + sumNumbers(array));
		

	}

}