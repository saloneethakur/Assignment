import java.util.Scanner;

class InterestCalculator {

    /**
     * Main method to execute the program.
     * It calculates Simple Interest and Compound Interest based on user inputs.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for inputs
        System.out.println("Enter the Principal Amount:");
        double principal = getValidDoubleInput(scanner);

        System.out.println("Enter the Rate of Interest (in %):");
        double rateOfInterest = getValidDoubleInput(scanner);

        System.out.println("Enter the Time (in years):");
        double time = getValidDoubleInput(scanner);

        System.out.println("Enter the Number of Times Interest is Compounded per Year:");
        int compoundingFrequency = getValidIntInput(scanner);

        // Calculate Simple Interest and Compound Interest
        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, time);
        double compoundInterest = calculateCompoundInterest(principal, rateOfInterest, time, compoundingFrequency);

        // Display results
        System.out.println("\nSimple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to calculate Simple Interest.
     * @param principal Principal amount.
     * @param rate Rate of interest (in %).
     * @param time Time (in years).
     * @return Simple Interest.
     */
    private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    /**
     * Method to calculate Compound Interest.
     * @param principal Principal amount.
     * @param rate Rate of interest (in %).
     * @param time Time (in years).
     * @param compoundingFrequency Number of times interest is compounded per year.
     * @return Compound Interest.
     */
    private static double calculateCompoundInterest(double principal, double rate, double time, int compoundingFrequency) {
        double ratePerPeriod = rate / (compoundingFrequency * 100);
        double totalAmount = principal * Math.pow(1 + ratePerPeriod, compoundingFrequency * time);
        return totalAmount - principal;
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
