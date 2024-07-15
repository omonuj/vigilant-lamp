import java.util.Scanner;
public class AreaPerimeter{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the width: ");
	double width = input.nextDouble();

	System.out.print("Enter the height: ");
	double height = input.nextDouble();

	double area = width * height;
	double perimeter = (height + width) * 2;

	System.out.printf("area %f", area);
	System.out.printf("perimeter %f", perimeter);

	}
}

