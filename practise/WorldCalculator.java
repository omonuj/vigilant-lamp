import java.util.Scanner;
public class WorldCalculator {
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter current world population: ");
	double currentPopulation = scanner.nextDouble();	
	
	System.out.print("Enter annual population growth rate: ");
	double growthRate = scanner.nextDouble();

	double  populationYear1 = (currentPopulation * 1) + growthRate;
	double  populationYear2 = (populationYear1 * 1) + growthRate;	
	double  populationYear3 = (populationYear2 * 1) + growthRate;
	double  populationYear4 = (populationYear3 * 1) + growthRate;
	double  populationYear5 = (populationYear4 * 1) + growthRate;
		
	System.out.println("Estimated world population after 1 year: "+populationYear1);
        System.out.println("Estimated world population after 2 years: "+populationYear2);
        System.out.println("Estimated world population after 3 years: "+populationYear3);
        System.out.println("Estimated world population after 4 years: "+populationYear4);
        System.out.println("Estimated world population after 5 years: "+populationYear5);

	}
}