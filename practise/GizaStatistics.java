import java.util.Scanner;
public class  GizaStatistics {
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter Estimated number of stones used: ");
	double numberOfStones = scanner.nextDouble();
	
	System.out.print("Enter Average weight per stone: ");
	double weightPerStone = scanner.nextDouble();

	System.out.print("Enter Number of years taken to build the pyramid: ");
	double numberOfYears = scanner.nextDouble();

	double totalWeight = numberOfStones * weightPerStone;
	double weightPerYear = totalWeight / numberOfYears;
	double weightPerHour = weightPerYear / (355 * 24);
	double weightPerMinute = weightPerHour / 60;

	System.out.println("Total weight of the pyramid: " + totalWeight + " tons");
        System.out.println("Weight built per year: " + weightPerYear + " tons");
        System.out.println("Weight built per hour: " + weightPerHour + " tons");
        System.out.println("Weight built per minute: " + weightPerMinute + " tons");

	}
}

	