public class WorldPopulationGrowthRate {

    public static void main(String[] args) {
       
        double initialPopulation = 8_000_000_000.0;
        double growthRate = 0.012; 
	double population = initialPopulation;
        double previousPopulation = initialPopulation;
	
        System.out.printf("%-10s %-20s %-20s%n", "Year", "Population", "Increase");


        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            previousPopulation = population;
            population += increase;

            System.out.printf("%-10d %-20.0f %-20.0f%n", year, population, increase);
        }

       
        double targetPopulation = initialPopulation * 2;
        int yearDoublePopulation = 0;
        population = initialPopulation;

        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;
            if (population >= targetPopulation) {
                yearDoublePopulation = year;
                break;
            }
        }

        System.out.println("The population will double in year: " + yearDoublePopulation);
    }
}
