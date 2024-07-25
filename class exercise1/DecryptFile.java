import java.util.Scanner;

public class DecryptFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an encrypted four-digit integer (positive or negative): ");
        String input = scanner.next();
        scanner.close();

        boolean isNegative = false;
        int num;
        if (input.startsWith("-")) {
            isNegative = true;
            num = Integer.parseInt(input.substring(1));
        } else {
            num = Integer.parseInt(input);
        }

        int digit1 = (num / 1000 - 7 + 10) % 10;
        int digit2 = ((num / 100) % 10 - 7 + 10) % 10;
        int digit3 = ((num / 10) % 10 - 7 + 10) % 10;
        int digit4 = (num % 10 - 7 + 10) % 10;

        String decrypted = (digit3 == 0 ? "0" : "") + digit4 + "" + digit1 + "" + digit2;

        System.out.println("Decrypted integer: " + (isNegative ? "-" : "") + decrypted);
    }
}

