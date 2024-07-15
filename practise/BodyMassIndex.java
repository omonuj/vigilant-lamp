import java.util.Scanner;
public class BodyMassIndex {
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter weightinpounds: ");
	double weightInPounds = scanner.nextDouble();	
	
	System.out.print("Enter heightininches: ");
	double heightInInches= scanner.nextDouble();

	double BMI = (weightInPounds * 703) / heightInInches * heightInInches;

	System.out.println("Your Body Mass Index is: "+BMI+" BMI");

        System.out.println("BMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal weight: 18.5 – 24.9");
        System.out.println("Overweight: 25 – 29.9");
        System.out.println("Obesity: 30 or greater");

}
} 