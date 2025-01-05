import java.util.Scanner;

class EvenOddChecker {

    // Optimized function to determine if a number is even or odd
    // This approach uses the modulo operator which has constant time complexity O(1)
    public static String determineEvenOdd(int number) {
        // A number is even if its remainder when divided by 2 is zero
        return (number % 2 == 0) ? "Even" : "Odd"; // Ternary operator for concise and readable code
    }

    // Main method for user input and displaying the result
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt(); // Read the number from the user

            // Call the determineEvenOdd function and get the result
            String result = determineEvenOdd(userInput);

            // Display the result to the user
            System.out.println("The number " + userInput + " is " + result + ".");
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
