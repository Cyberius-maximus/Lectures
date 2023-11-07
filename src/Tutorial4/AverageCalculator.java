package Tutorial4;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}
