package Tutorial5;
import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = input.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter two numbers: ");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + myAdd(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + mySub(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + myMul(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + myDiv(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    static double myAdd(double a, double b) {
        return a + b;
    }

    static double mySub(double a, double b) {
        return a - b;
    }

    static double myMul(double a, double b) {
        return a * b;
    }

    static double myDiv(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}
