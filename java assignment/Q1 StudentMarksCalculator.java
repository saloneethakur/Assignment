import java.util.Scanner;

class StudentMarksCalculator {

    /**
     * Main method to drive the program.
     * It collects marks for 5 subjects from the user and calculates the sum and percentage.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Constants
        final int NUMBER_OF_SUBJECTS = 5;

        // Array to store marks for each subject
        int[] marks = new int[NUMBER_OF_SUBJECTS];

        // Collecting marks for each subject
        System.out.println("Enter marks for " + NUMBER_OF_SUBJECTS + " subjects:");
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            marks[i] = getValidMarks(scanner, i + 1);
        }

        // Calculate the total and percentage
        int totalMarks = calculateSum(marks);
        double percentage = calculatePercentage(totalMarks, NUMBER_OF_SUBJECTS);

        // Display results
        System.out.println("\nTotal Marks Obtained: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to validate and return marks entered by the user.
     * @param scanner Scanner object for input.
     * @param subjectNumber Subject number for user prompt.
     * @return Valid marks as an integer.
     */
    private static int getValidMarks(Scanner scanner, int subjectNumber) {
        int marks;
        while (true) {
            System.out.print("Subject " + subjectNumber + ": ");
            if (scanner.hasNextInt()) {
                marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Please enter valid marks (0-100).\n");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.\n");
                scanner.next(); // Clear invalid input
            }
        }
        return marks;
    }

    /**
     * Method to calculate the sum of marks.
     * @param marks Array of marks.
     * @return Total sum of marks.
     */
    private static int calculateSum(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    /**
     * Method to calculate the percentage based on total marks and number of subjects.
     * @param totalMarks Total marks obtained.
     * @param numberOfSubjects Number of subjects.
     * @return Percentage as a double.
     */
    private static double calculatePercentage(int totalMarks, int numberOfSubjects) {
        return (double) totalMarks / (numberOfSubjects * 100) * 100;
    }
}
