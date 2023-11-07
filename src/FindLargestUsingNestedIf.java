import java.util.Scanner;

public class FindLargestUsingNestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        } else {
            if (num2 >= num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }

        input.close();
    }
}
