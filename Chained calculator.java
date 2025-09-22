import java.util.Scanner;

public class ChainedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        boolean firstOperation = true;
        boolean running = true;

        System.out.println("=== Console Calculator ===");

        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                running = false;
                continue;
            }

            if (firstOperation) {
                // First time: take two numbers
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        continue;
                }
                firstOperation = false;
            } else {
                // Subsequent operations: take one number and continue with result
                System.out.print("Enter your number: ");
                double num = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = result + num;
                        break;
                    case 2:
                        result = result - num;
                        break;
                    case 3:
                        result = result * num;
                        break;
                    case 4:
                        if (num != 0) {
                            result = result / num;
                        } else {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        continue;
                }
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
                  }
