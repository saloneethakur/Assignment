import java.util.Scanner;

class GradeCalculator {

    // Optimized function to calculate the percentage from an array of marks
    public static double calculatePercentage(int[] marks) {
        // Sum of marks in all subjects
        int totalMarks = 0;

        // Loop through the marks array to sum the marks
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Return the percentage (total marks / number of subjects)
        return totalMarks / (double) marks.length;
    }

    // Function to determine the grade based on the percentage
    public static char determineGrade(double percentage) {
        // Using if-else statements to assign grades based on percentage ranges
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // Main method for user input and displaying the result
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Array to store marks for five subjects
            int[] marks = new int[5];

            // Prompt the user to enter marks for five subjects
            System.out.println("Enter marks for five subjects:");

            for (int i = 0; i < marks.length; i++) {
                // Read marks for each subject
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            // Calculate the percentage by calling calculatePercentage method
            double percentage = calculatePercentage(marks);

            // Determine the grade by calling determineGrade method
            char grade = determineGrade(percentage);

            // Display the result: Percentage and Grade
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input. Please enter valid integer marks.");
        }
    }
}
