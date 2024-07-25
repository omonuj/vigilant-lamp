import java.util.Scanner;

public class EncryptFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a four-digit integer (positive or negative): ");
        int num = scanner.nextInt();
        

        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        int digit1 = (num / 1000 + 7) % 10;
        int digit2 = ((num / 100) % 10 + 7) % 10;
        int digit3 = ((num / 10) % 10 + 7) % 10;
        int digit4 = (num % 10 + 7) % 10;

        int encrypted = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
        System.out.println("Encrypted integer: " + (isNegative ? "-" : "") + encrypted);
    }
}

