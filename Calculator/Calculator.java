import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Simple Calculator ===");

        while (keepRunning) {
            try {
                System.out.print("\nEnter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                char operator;
                while (true) {
                    System.out.print("Choose operation (+, -, *, /): ");
                    operator = input.next().charAt(0);

                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        break; // valid operator mila, loop se bahar
                    } else {
                        System.out.println("Invalid operator. Please use +, -, *, or /.");
                    }
                }

                double result;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                }

                // Ab user se poochho continue karna hai ya exit
                System.out.print("\nDo you want to perform another calculation? (yes/no): ");
                String choice = input.next();

                if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("exit")) {
                    keepRunning = false;
                    System.out.println("Exiting Calculator. Goodbye!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter numeric values only.");
                input.nextLine(); // invalid input clear karna
            }
        }

        input.close();
    }
}
