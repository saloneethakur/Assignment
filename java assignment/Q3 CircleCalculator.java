import java.util.Scanner;

class CircleCalculator {

    /**
     * Main method to execute the program.
     * It calculates the area and circumference of a circle based on the radius provided by the user.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the radius of the circle
        System.out.println("Enter the radius of the circle:");
        double radius = getValidDoubleInput(scanner);

        // Calculate the area and circumference of the circle
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        // Display results with 2 decimal places
        System.out.printf("\nArea of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to calculate the area of a circle.
     * @param radius Radius of the circle.
     * @return Area of the circle.
     */
    private static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Method to calculate the circumference of a circle.
     * @param radius Radius of the circle.
     * @return Circumference of the circle.
     */
    private static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
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
