package Lecture1;
import java.util.Scanner;
public class AreaCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");

        int choice = scanner.nextInt();

        if (choice == 1) {
            
            System.out.print("Enter the length of one side of the square: ");
            double sideLength = scanner.nextDouble();
            double squareArea = sideLength * sideLength;
            System.out.println("Area of the square: " + squareArea);
        } else if (choice == 2) {
            
            System.out.print("Enter the base length of the Rectangle: ");
            double baseLength = scanner.nextDouble();
            System.out.print("Enter the height of the Rectangle: ");
            double height = scanner.nextDouble();
            double RectangleArea = baseLength * height;
            System.out.println("Area of the triangle: " + RectangleArea);
        } else {
            System.out.println("Invalid choice. Please select 1 for a square or 2 for a Rectangle.");
        }

        scanner.close();
    }
}

    

