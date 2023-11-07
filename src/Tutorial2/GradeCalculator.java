package Tutorial2;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks >= 75) {
            System.out.println("Distinction");
        } else if (marks >= 60) {
            System.out.println("First Class");
        } else if (marks >= 50) {
            System.out.println("Second Class");
        } else if (marks >= 45) {
            System.out.println("Pass Class");
        } else {
            System.out.println("Fail");
        }

        input.close();
    }
}
