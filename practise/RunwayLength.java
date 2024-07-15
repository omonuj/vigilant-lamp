import java.util.Scanner;
public class Runway
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter speed & acceleration");
		double speedAcceleration = input.nextDouble();

		System.out.print("Enter minimum runway length");
		double minimumLength = input.nextDouble();

		double a = speedAcceleration * speedAcceleration;
		double v = minimumLength + minimumLength;
		double lenght = a / v;

		System.out.print("length");
	}
}
