import java.util.Scanner;
public class  GasMileage {
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	while (true) {
	System.out.print("Enter miles driven ( -1 to quite): ");
	int miles = scanner.nextInt();
	if (miles == -1) {
		break;
	}
	
	
	System.out.print("Enter gallons used: ");
	int gallons = scanner.nextInt();

	int milesPerGallon = (int) miles / gallons;
		System.out.printf("Miles per gallon for this trip is: "+milesPerGallon);
	
	int totalMiles = miles;
	int totalGallon = gallons;

	int combinedMilesPerGallon = totalMiles / totalGallon;
		System.out.println("Combined miles per gallon: "+combinedMilesPerGallon);
	}
}
}

	
