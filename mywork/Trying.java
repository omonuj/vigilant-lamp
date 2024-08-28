import java.util.Scanner;

public class Trying {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter three words seperated by spaces: ");
	String first = scanner.nextLine();

	
	String [] jonah = first.split("  ");

	for ( String index : jonah) {

	System.out.println(index);
	}
}
}