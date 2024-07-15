import java.util.Scanner;
public class AreaPerimeterCircle{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter area: ");
	double area = scanner.nextDouble();
	
	System.out.print("Enter perimeter: ");
	double perimeter = scanner.nextDouble();

	double pie = 3.14159;
	double radius = 6.5;
	perimeter = 2 * radius * pie;
	area = radius * radius * pie;

	System.out.printf("the perimeter is %f: ", perimeter);
	System.out.printf("the area is %f: ", area);
	}
}


