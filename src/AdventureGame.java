import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;
        String location = "Start";
        String description = "You are in a small spaceship, floating in the vast expanse of the galaxy.";

        while (gameRunning) {
            // Prompt the player for input
            System.out.println(description);
            System.out.println("Enter a command:");
            String command = scanner.nextLine();

            // Handle the command
            if (command.equals("quit")) {
                gameRunning = false;
            } else if (command.equals("look")) {
                System.out.println("You are at: " + location);
            } else if (command.equals("go north")) {
                location = "North";
                description = "You have arrived at a bustling spaceport, filled with aliens from all corners of the galaxy.";
                System.out.println("You moved to: " + location);
            } else {
                System.out.println("Unknown command: " + command);
            }
        }
    }
}
