import java.util.Scanner;
public class Runway
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter speed: ");
		double speed = input.nextDouble();

		System.out.print("Enter acceleration: ");
		double acceleration = input.nextDouble();

		double meter = speed * speed;
		double seconds = acceleration * acceleration;
		double lenght = meter / seconds;

		System.out.printf("The minimum runway lenth for this airplane is %f", lenght);
	}
}
