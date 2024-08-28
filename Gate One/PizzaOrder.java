import java.util.Scanner;

public class PizzaOrder {

  public static void DisplayMenu() {

    System.out.print("""   
                     +--------------------------------------------------+
                     | Pizza Type | Number of Slices  |  Price per Box  |
                     +--------------------------------------------------+
                     | Sapa size  |       4           |   2000 Naira    |
                     +--------------------------------------------------+
                     | Small Money|       6           |   2400 Naira    |
                     +--------------------------------------------------+
                     | Big Boys   |       8           |   3000 Naira    |
                     +--------------------------------------------------+
                     | Odogwu     |       12          |   4200 Naira    |
                     +--------------------------------------------------+

""");
                     
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    while (true) {
	DisplayMenu();

	try {
      	   System.out.print("Enter the number of people (or type 'Exit' to quit): ");
      	   String numberOfPeople = scanner.nextLine().trim();
	 
	   if (numberOfPeople.equalsIgnoreCase("Exit")) {	
		break;
	   }   
	
	   int numOfPeople = (int)Integer.parseInt(numberOfPeople);

      	   System.out.print("Enter Pizza type: ");
      	   String pizzaType = scanner.nextLine().trim().toLowerCase();

      	   int slicePerBox;
           int pricePerBox;

           switch (pizzaType) {
        	case "sapa size":
       		   slicePerBox = 4;
        	   pricePerBox = 2000;
         	   break;
       		case "small Money":
          	   slicePerBox = 6;
          	   pricePerBox = 2400;
          	   break;
        	case "big Boys":
                   slicePerBox = 8;
          	   pricePerBox = 3000;
                   break;
        	case "odogwu":
                   slicePerBox = 12;
                   pricePerBox = 4200;
                   break;
                default:
                   throw new IllegalArgumentException("Invalid pizza type");
           }

      	int boxesNeeded = numOfPeople / slicePerBox;
      	int leftOverSlices = numOfPeople % slicePerBox;

      	if (leftOverSlices > 0) {
      	  boxesNeeded += 1;
          leftOverSlices = (boxesNeeded * slicePerBox) - numOfPeople;
      	}

      	int totalPrice = boxesNeeded * pricePerBox;
      
        System.out.println("Number of boxes needed: " + boxesNeeded + " boxes");
      	System.out.println("Number of slices left over: " + leftOverSlices + " slices");
        System.out.println("Total price: " + totalPrice + " Naira");

       } catch (IllegalArgumentException e) {
       System.out.println("Invalid input. Please enter a valid pizza type.");
       } catch (Exception e) {
       System.out.println("An error occurred. Please try again.");
       }
    }
  }
}
      