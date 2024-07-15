import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Countries{
	public static void main(String [] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the first country: ");
	String first = scanner.nextLine();

	System.out.print("Enter the second country: ");
	String second = scanner.nextLine();

	System.out.print("Enter the third country: ");
	String third = scanner.nextLine();
	
	String [] countries = {first, second, third };

	Arrays.sort(countries, Collections.reverseOrder());

	System.out.println("Countries in descending order: ");
	for (String country : countries){
	System.out.println(country);
	}
	
	scanner.close();
	}
}
	
	