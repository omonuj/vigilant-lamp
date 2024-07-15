import java.util.Scanner;
public class DiameterCircumference{
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter radius: ");
	double radius = scanner.nextDouble();
	
	double pi = 3.14159;

	System.out.printf("The Diameter is: %.2f%n", 2 * radius);
	System.out.printf("The Circumference is: %.2f%n", 2 * 3.14159 * radius);
	System.out.printf("The Area is: %.2f%n", 3.14159 * radius * radius);
	}
}
