import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        System.out.println("Welcome to the Superhero Database!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1) Create a new superhero");
            System.out.println("2) Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter superhero name: ");
                scanner.nextLine(); // Consume newline
                String name = scanner.nextLine();

                System.out.print("Enter real name: ");
                String realName = scanner.nextLine();

                System.out.print("Is the superhero human? (true/false): ");
                boolean isHuman = scanner.nextBoolean();

                System.out.print("Enter creation year: ");
                int creationYear = scanner.nextInt();

                System.out.print("Enter strength: ");
                scanner.nextLine(); // Consume newline
                String strength = scanner.nextLine();

                Superhero superhero = new Superhero(name, realName, isHuman, creationYear, strength);
                database.addSuperhero(superhero);
                System.out.println("Superhero added to the database.");
            } else if (choice == 2) {
                System.out.println("Exiting the Superhero Database.");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
