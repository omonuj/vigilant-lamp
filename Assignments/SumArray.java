public class SumArray {
	public static int sumNumbers(int[] arr){

	int total = 0;

	for (int index = 0; index < arr.length; index++) {
		total += arr[index];
	}
	return total;
	
	}
	public static void main(String [] args) {
	
	int [] array = {23, 45, 76, 90, 90, 45, 67};
	
	System.out.print("Original list: ");
	for(int index : array){
		System.out.print(index + " ");
	}

	System.out.println();
	sumNumbers(array);
	
	System.out.println("Sum of the numbers above is: " + sumNumbers(array))
;

	}
}