package Tutorial5;
import java.util.Scanner;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value (n) to sum integers from 0 to n: ");
        int n = input.nextInt();

        int result = sumIntegers(n);
        System.out.println("Sum of integers from 0 to " + n + " is: " + result);

        input.close();
    }

    static int sumIntegers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumIntegers(n - 1);
        }
    }
}
