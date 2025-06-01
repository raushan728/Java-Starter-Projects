import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        double[] marks = new double[5];
        double total = 0;
        double average;
        char grade;

        System.out.println("🎓 Welcome to Grade Calculator!");
        System.out.println("Please enter marks for 5 subjects (out of 100):");

        while (!validInput) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter marks for subject " + (i + 1) + ": ");
                    double input = scanner.nextDouble();

                    if (input < 0 || input > 100) {
                        throw new IllegalArgumentException("Marks must be between 0 and 100.");
                    }

                    marks[i] = input;
                    total += marks[i];
                }

                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter numbers only.");
                scanner.nextLine();
                total = 0;
            } catch (IllegalArgumentException e) {
                System.out.println("❌ " + e.getMessage());
                scanner.nextLine();
                total = 0;
            }
        }

        average = total / marks.length;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n📊 Results:");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
