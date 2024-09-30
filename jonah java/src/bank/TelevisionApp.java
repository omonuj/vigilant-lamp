package bank;

import java.util.Scanner;

public class TelevisionApp {
    public static void main(String[] args) {
        Television tv = new Television(5, 12);
        Scanner scanner = new Scanner(System.in);

        print("Television App is running. What would you like to do?");

        while (true) {
            print("\nOption:");
            print("""
                    1 ~ Turn On the TV
                    2 ~ Turn Off the TV
                    3 ~ Set Channel
                    4 ~ Increase Channel
                    5 ~ Decrease Channel
                    6 ~ Set Volume
                    7 ~ Increase Volume
                    8 ~ Decrease Volume
                    9 ~ Reset Channel to 1
                    10 ~ Get Current Channel
                    11 ~ Get Current Volume Level
                    0 ~ Exit
                    """);
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> {
                        if (tv.turnOn()) {
                            print("The TV is now ON.");
                        }
                    }
                    case 2 -> {
                        if (tv.turnOff()) {
                            print("The TV is OFF.");
                        }
                    }
                    case 3 -> {
                        print("Enter the channel you want to set (1-120): ");
                        int channel = Integer.parseInt(scanner.nextLine());
                        tv.setChannel(channel);
                        print("Channel set to " + tv.getChannel());
                    }
                    case 4 -> {
                        tv.increaseChannel(tv.getChannel());
                        print("Channel increased to " + tv.getChannel());
                    }
                    case 5 -> {
                        tv.decreaseChannel(tv.getChannel());
                        print("Channel decreased to " + tv.getChannel());
                    }
                    case 6 -> {
                        print("Enter the volume level you want to set (1-15): ");
                        int volume = Integer.parseInt(scanner.nextLine());
                        tv.setVolumeLevel(volume);
                        print("Volume level set to " + tv.getVolumeLevel());
                    }
                    case 7 -> {
                        tv.increaseVolumeLevel(tv.getVolumeLevel());
                        print("Volume level increased to " + tv.getVolumeLevel());
                    }
                    case 8 -> {
                        tv.decreaseVolumeLevel(tv.getVolumeLevel());
                        print("Volume level decreased to " + tv.getVolumeLevel());
                    }
                    case 9 -> {
                        tv.resetChannel();
                        print("Channel reset to " + tv.getChannel());
                    }
                    case 10 -> print("Current channel is " + tv.getChannel());
                    case 11 -> print("Current volume level is " + tv.getVolumeLevel());
                    case 0 -> {
                        print("\nExit application. Goodbye.");
                        return;
                    }
                    default -> print("Invalid option. Try again.");
                }
            }
            catch (NumberFormatException e) {
                print("Invalid input. please enter a number.");
            } catch (Exception e) {
                print("An unexpected error has occurred. ' + getMessage()");
            }
        }
    }
    private static void print(String message) {
        System.out.println(message);
    }
}
