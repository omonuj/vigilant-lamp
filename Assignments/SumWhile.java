public class SumWhile {

	public static int sumWhileLoop(int [] arr) {

		int total = 0;
		int index = 0;

		while (index < arr.length) {
		total += arr[index];
		index++;
		}
	return total;
	}

	public static void main(String [] args) {
	
		int [] array = {20, 30, 45, 56, 67, 78};

		System.out.print("Original list: ");
		
		for(int index : array) {
			System.out.print(index + " ");
		}
		System.out.println();

		sumWhileLoop(array);

		System.out.println("Sum of numbers are: " + sumWhileLoop(array));

		


}


}