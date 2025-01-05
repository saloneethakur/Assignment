import java.util.Scanner;

class NumberEqualityChecker {

    /**
     * Main method to execute the program.
     * It checks whether two numbers entered by the user are equal or not.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.println("Enter the first number:");
        int number1 = getValidIntInput(scanner);

        // Prompt user for the second number
        System.out.println("Enter the second number:");
        int number2 = getValidIntInput(scanner);

        // Check if the numbers are equal and display the result
        if (number1 == number2) {
            System.out.println("\nThe two numbers are equal.");
        } else {
            System.out.println("\nThe two numbers are not equal.");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to validate and return an integer input.
     * @param scanner Scanner object for input.
     * @return Valid integer value.
     */
    private static int getValidIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }
}
