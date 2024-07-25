public class WorldPopulationGrowth {
    public static void main(String[] args) {
        

        double currentPopulation = 8.e9;
        double growthRate = 0.012; 

        System.out.println("Year\tPopulation\tIncrease");

        for (int year = 1; year <= 75; year++) {
            double population = currentPopulation * Math.pow(1 + growthRate, year);
            double increase = population - currentPopulation * Math.pow(1 + growthRate, year - 1);

            System.out.printf("%d\t%.2f\t%.2f%n", year, population, increase);

            if (population >= 2 * currentPopulation) {
                System.out.println("Population will double by year " + year);
                break;
            }
        }
    }
}


