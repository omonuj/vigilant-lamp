public class CarApplication {

	public static void main(String [] args) {

	//create two Car objects
	Car car1 = new Car("Toyota Camry", "2020", 30000);
	Car car2 = new Car("Honda Accord", "2021", 28000);

	//display each car's price
	System.out.println("Car 1 price: #" + car1.getPrice());
	System.out.println("Car 2 price: #" + car2.getPrice());

	 car1.applyDiscount(5); // 5% discount on the first car
        car2.applyDiscount(7); // 7% discount on the second car

        // Display each car's price again
        System.out.println("Car 1 price after discount: $" + car1.getPrice());
        System.out.println("Car 2 price after discount: $" + car2.getPrice());

}

}