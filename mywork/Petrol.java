public class Petrol {

	public static void main(String [] args) {

	PetrolPurchase purchase = new PetrolPurchase("Station A", "Premium", 50, 1.25, 15.5);	


	//Display the details of the purchase
	System.out.println("Location: " + purchase.getLocation());
	System.out.println("Petrol Type: " + purchase.getPetrolType());
	System.out.println("Quantity: " + purchase.getQuantity());
	System.out.println("Price Per Liter: " + purchase.getPricePerLiter());
	System.out.println("Discount Percentage: " + purchase.getDiscountPercentage());


	//Calculate nand display the net purchase amount
	System.out.println("Net Purchase Amount: #" + purchase.getPurchaseAmount());
	}
	

}