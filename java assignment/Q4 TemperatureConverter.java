import java.util.Scanner;
class TemperatureConverter {

    /**
     * Main method to execute the program.
     * It accepts temperature in Celsius and converts it to Fahrenheit.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the temperature in Celsius
        System.out.println("Enter the temperature in Celsius:");
        double celsius = getValidDoubleInput(scanner);

        // Convert Celsius to Fahrenheit
        double fahrenheit = convertToFahrenheit(celsius);

        // Display the result with 2 decimal places
        System.out.printf("\nTemperature in Fahrenheit: %.2f\n", fahrenheit);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to convert Celsius to Fahrenheit.
     * @param celsius Temperature in Celsius.
     * @return Temperature in Fahrenheit.
     */
    private static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Method to validate and return a double input.
     * @param scanner Scanner object for input.
     * @return Valid double value.
     */
    private static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }
}
