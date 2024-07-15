import java.util.Scanner;
public class DiameterCircumference{
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter radius: ");
	int radius = scanner.nextInt();
	
	int pi = 3.14159;

	System.out.println("the diameter is radius * radius");
	System.out.println("the circumference is (pi * pi) * radius * radius",);
	System.out.println("the area is pi * (radius * radius)");
	}
}
