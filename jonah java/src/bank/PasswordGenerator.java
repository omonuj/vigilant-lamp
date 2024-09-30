package bank;
import java.util.Random;
import java.util.Scanner;

class PasswordGenerate {
    private int length;
    private boolean useUpperCase;
    private boolean useDigits;
    private boolean useSpecial;

    public PasswordGenerate(int length, boolean useUpperCase, boolean useDigits, boolean useSpecial) {
        this.length = length;
        this.useUpperCase = useUpperCase;
        this.useDigits = useDigits;
        this.useSpecial = useSpecial;
    }
    public String generatePassword() {
        String allCharacters = buildCharacterSet();
        return createPassword(allCharacters);
    }
    private String buildCharacterSet() {
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String UpperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = useDigits ? "0123456789" : "";
        String specialCharacters = useSpecial ? "!@#$%^&*()-_=+[]{};:,.<>?" : "";

        String allCharacters = lowerCaseLetters + UpperCaseLetters + digits + specialCharacters;

        if (allCharacters.isEmpty()) {
            throw new IllegalArgumentException("Atleast one character is required");
        }
        return allCharacters;
    }
    private String createPassword(String allCharacters) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int index = 0; index < length; index++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }
        return password.toString();
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setUseDigits(boolean useDigits) {
        this.useDigits = useDigits;
    }
    public void setUseUpperCase(boolean useUpperCase) {
        this.useUpperCase = useUpperCase;
    }
    public void setUseSpecial(boolean useSpecial) {
        this.useSpecial = useSpecial;
    }
}

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the password Generator App!");

        PasswordGenerate passwordGenerate = null;

        while(true) {
            try {
                int length = getPasswordLength(scanner);
                boolean useUppercase = getUserPreference(scanner, "include uppercase letters? (y/n): ");
                boolean useDigits = getUserPreference(scanner, "Include special characters? (y/n): ");
                boolean useSpecial = getUserPreference(scanner, "Include special chracters? (y/n): ");

                passwordGenerate = new PasswordGenerate(length, useUppercase, useDigits, useSpecial);

                String password = passwordGenerate.generatePassword();
                System.out.println("Generated password: " + password);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for password lenngth!, Please enter a valid number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
    private static int getPasswordLength(Scanner scanner) {
        System.out.print("Enter password length(e.g., 12): ");
        return Integer.parseInt(scanner.nextLine());
    }
    private static boolean getUserPreference(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine().equalsIgnoreCase("y");
    }
}
