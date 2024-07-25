public class PetrolPurchase {

	private String 	location;
	private String petrolType;
	private int quantity;
	private double pricePerLiter;
	private double discountPercentage;

	public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLiter, double discountPercentage) {

	this.location = location;
	this.petrolType = petrolType;
	this.quantity = quantity;
	this.pricePerLiter = pricePerLiter;
	this.discountPercentage = discountPercentage;

	}
	//setters
	public void setLocation(String location) {	

	this.location = location;

	}

	public void setPetrolType(String petrolType){
	
	this.petrolType = petrolType;
	}
	public void setQuantity(int quantity){

	this.quantity = quantity;
	}

	public void setPricePerLiter(double pricePerLiter){
	
	this.pricePerLiter = pricePerLiter;
	
	}

	public void setDiscountPercentage(double discountPercentage){

	this.discountPercentage= discountPercentage;
	
	}
	//getters
	public String getLocation(){
	
	return location;
	}
	public String getPetrolType(){
	
	return petrolType;
	}
	public int getQuantity(){
	
	return quantity;
	}
	public double getPricePerLiter(){

	return pricePerLiter;
	}
	public double getDiscountPercentage(){
	
	return discountPercentage;
	}
	//method to calculate the net purchase amount
	public double getPurchaseAmount(){
		
		double grossAmount = quantity * pricePerLiter;
		double discount = grossAmount * (discountPercentage / 100);
		return grossAmount - discount;
	}

}	
	





