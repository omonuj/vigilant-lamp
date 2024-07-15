public class DispatchRiderCalculators {

    public static void main(String[] args) {
        // Test cases
        System.out.println(calculateWage(80)); // Expected: 45000
        System.out.println(calculateWage(25)); // Expected: 9000
    }

    public static int calculateWage(int successfulDeliveries) {
        int basePay = 5000;
        int amountPerParcel = 0;

        // Calculate collection rate
        double collectionRate = (successfulDeliveries / 100.0) * 100;

        // Determine amount per parcel based on collection rate
        if (collectionRate < 50) {
            amountPerParcel = 160;
        } else if (collectionRate >= 50 && collectionRate < 60) {
            amountPerParcel = 200;
        } else if (collectionRate >= 60 && collectionRate < 70) {
            amountPerParcel = 250;
        } else if (collectionRate >= 70) {
            amountPerParcel = 500;
        }

        // Calculate the total wage
        int totalWage = successfulDeliveries * amountPerParcel + basePay;
        return totalWage;
    }
}
