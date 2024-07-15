public class DispatchRiderCalculators {

    public static void main(String[] args) {

        System.out.println(calculateWage(80)); 
        System.out.println(calculateWage(25)); 
    }

    public static int calculateWage(int successfulDeliveries) {
        int basePay = 5000;
        int amountPerParcel = 0;

        
        double collectionRate = (successfulDeliveries / 100.0) * 100;

        if (collectionRate < 50) {
            amountPerParcel = 160;
        } else if (collectionRate >= 50 && collectionRate < 60) {
            amountPerParcel = 200;
        } else if (collectionRate >= 60 && collectionRate < 70) {
            amountPerParcel = 250;
        } else if (collectionRate >= 70) {
            amountPerParcel = 500;
        }

        int totalWage = successfulDeliveries * amountPerParcel + basePay;
        return totalWage;
    }
}
