import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Protest {
    
    public static void main(String[] args) {
        List<String> demands = new ArrayList<>();
        demands.add("EndBadGovernanceInNigeria");
        demands.add("Address cost of living emmediately");
        demands.add("Solve the Insecurity problem");
        demands.add("Release ENDSARS protesters");
        demands.add("Protect farms and farmers");
	demands.add("Human capital Development");
	demands.add("Restore price of fuel back to #180");
	demands.add("Electorial Reform");
	demands.add("Establish a living wage");
	demands.add("Constitutional and judicial reforms");

        Random random = new Random();
        String randomDemands = demands.get(random.nextInt(demands.size()));

        System.out.println("One of the demands by the Protesters: " + randomDemands);
    }
}


