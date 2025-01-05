import java.util.Scanner;

class VariableSwapper {

    /**
     * Main method to execute the program.
     * It swaps the values of two variables using a third variable.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the values of two variables
        System.out.println("Enter the value of variable A:");
        int a = getValidIntInput(scanner);

        System.out.println("Enter the value of variable B:");
        int b = getValidIntInput(scanner);

        // Display original values
        System.out.printf("\nBefore swapping: A = %d, B = %d\n", a, b);

        // Swap the values using a third variable
        int temp = a;
        a = b;
        b = temp;

        // Display swapped values
        System.out.printf("After swapping: A = %d, B = %d\n", a, b);

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