public class ReverseNew {

	public static int [] reverse(int [] blue) {

	String red = "";
	for ( int index = blue.length() - 1; index >= 0; index--) {
		red = red + blue.charAt(index);
	}
	return red;
	}

	public static void main(String [] args) {
	
	int [] array = new int{1, 2, 3, 4, 5};
	
	reverse(array);

	System.out.println(reverse(array));

	}
}