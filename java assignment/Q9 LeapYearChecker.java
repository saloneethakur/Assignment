import java.util.Scanner;

class LeapYearChecker {

    // Function to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4, but not by 100 unless it's divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Main method for user input and displaying the result
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a year
            System.out.print("Enter a year: ");
            int userInput = scanner.nextInt(); // Read the year from the user

            // Call the isLeapYear function and get the result
            boolean isLeap = isLeapYear(userInput);

            // Display the result to the user
            if (isLeap) {
                System.out.println(userInput + " is a leap year.");
            } else {
                System.out.println(userInput + " is not a leap year.");
            }
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
