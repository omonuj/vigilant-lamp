public class ExampleArray {

	public static void main(String [] args) {

	int [] jonah = {30, 45, 67, 90, 89 ,9, 98, 34, 23, 56};
	
	System.out.printf("%s%8s%n", "Index", "Value");

	for(int index = 0;index < jonah.length;index++) {
	  System.out.printf("%5d%8d%n", index, jonah[index]);
		
  	}
     }
}