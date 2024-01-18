import java.util.Scanner; // For input in java

public class SimplyCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Make a scanner 
        boolean quit = false;

        while (!quit) {
            // Input the first number
            System.out.println("Welcome to Carter's Calculator!");
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Input the second number
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Display operation menu
            System.out.println("Select an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit");

            // User choice input
            int choice = scanner.nextInt();

            switch (choice) {
                // Add
                case 1:
                    double sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                // Sub
                case 2:
                    double difference = num1 - num2;
                    System.out.println("Result: " + difference);
                    break;
                // Multi
                case 3:
                    double product = num1 * num2;
                    System.out.println("Result: " + product);
                    break;
                // Div
                case 4:
                    if (num2 != 0) {
                        double quotient = num1 / num2;
                        System.out.println("Result: " + quotient);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                // Quit
                case 5:
                    quit = true;
                    break;
                // Invalid choice  in more ways than one
                //Why no work need more money es no problem?
                default:
                    System.out.println("Invalid choice!");
            }

            if (!quit) {
                // Ask if user wants to perform another calc
                System.out.println("Do you want to perform another calculation? (Y/N)");
                String continueChoice = scanner.next();
                if (continueChoice.equalsIgnoreCase("N")) {
                    quit = true;
                }
            }
        }

        // No Go  message
        System.out.println("Calculator program terminated.");
        scanner.close();
    }
}

