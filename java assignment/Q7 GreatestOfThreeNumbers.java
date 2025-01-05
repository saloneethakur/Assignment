import java.util.Scanner;

class GreatestOfThreeNumbers {

    /**
     * Main method to execute the program.
     * It finds the greatest of three numbers entered by the user.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for three numbers
        System.out.println("Enter the first number:");
        int number1 = getValidIntInput(scanner);

        System.out.println("Enter the second number:");
        int number2 = getValidIntInput(scanner);

        System.out.println("Enter the third number:");
        int number3 = getValidIntInput(scanner);

        // Determine the greatest number
        int greatest = findGreatest(number1, number2, number3);

        // Display the result
        System.out.printf("\nThe greatest number is: %d\n", greatest);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to find the greatest of three numbers.
     * @param num1 First number.
     * @param num2 Second number.
     * @param num3 Third number.
     * @return The greatest number.
     */
    private static int findGreatest(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
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
