public class Car {

	private String model;
	private String year;
	private double price;

	public Car(String model, String year, double price) {
	
	this.model = model;
	this.year = year;
	if (price > 0) {
		this.price = price;
	}else {
		this.price = 0;	
	}
	}
	//setters
	public void setModel(String model){
	
	this.model = model;
	}
	public void setYear(String year){
	
	this.year = year;
	}
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	//getters
	public String getModel(){
	
	return model;
	}

	public String getYear() {
	
	return year;
	}
	
	public double getPrice() {

	return price;
	}

	//method to apply discount
	public void applyDiscount(double percentage) {

		if (percentage > 0) {
			price -= price * (percentage / 100);
		}

	}
}









