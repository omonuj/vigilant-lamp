import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a credit card number: ");
      String cardNumber = scanner.nextLine();
      System.out.println();

      try {
        if (isValidCreditCard(cardNumber)) {
          String cardType = getCardType(cardNumber);
          if (cardType != null && isValidCreditCard(cardNumber)) {
            System.out.println("Valid credit card number." + cardNumber);
	    System.out.println("Card type is: " + cardType + "card.");
          } else {
            System.out.println("Invalid credit card number.");
          }
        } else {
          System.out.println("Invalid input. please enter a valid credit card number.");
        }
    } catch (Exception e) {
        System.out.println("An error occured: " + e.getMessage());
    }
  }

   public static String getCardType(String cardNumber) {
     int length = cardNumber.length();

      if (cardNumber.startsWith("4") && (length == 13 || length == 16)) {
        return "Visa";
      } else if (cardNumber.startsWith("5") && length == 16) {
        return "Master";
      } else if (cardNumber.startsWith("37") && length == 15) {
        return "American Express";
      } else if (cardNumber.startsWith("6") && length == 16) {
        return "Discovery";
      } else if ((cardNumber.startsWith("506") || cardNumber.startsWith("650")) && (length == 16 || length == 19)) {
        return "Verve";
      }
      return null;
   }   

public static boolean isValidCreditCard(String cardNumber) {
  int sum = 0;
  boolean alternate = false;
  for (int index = cardNumber.length() - 1; index >= 0; index--) {
    int credit;
    try {
      credit = Integer.parseInt(cardNumber.substring(index, index + 1));
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("Invalid character in card number.");
    }

    if (alternate) {
      credit *= 2;
      if (credit > 9) {
        credit = (credit % 10) + 1;
      }
    }
    sum += credit;
    alternate = !alternate;
  }
  return (sum % 10 == 0);
}
    
}