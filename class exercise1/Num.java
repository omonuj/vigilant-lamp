public class Num {

	public static void main(String [] args) {

	int [] array = {2,1,4,3,6,5,7};
	
	customSort(array);

	for (int num : array) {
		System.out.print(num + " ");

        }
	}

	public static void customSort(int[] array) {
	
	for (int index = 0; index < array.length - 1; index += 2) {
		int temp = array[index];
		array[index] = array[index + 1];
		array[index + 1] = temp;
		int result = array[index + 1];
	}
	
		
     }

}