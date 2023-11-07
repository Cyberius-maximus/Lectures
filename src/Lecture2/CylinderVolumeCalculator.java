package Lecture2;

import java.util.Scanner;

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the cylinder's base: ");
        double radius = scanner.nextDouble();

        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        
        double volume = Math.PI * (radius * radius) * height;

        
        System.out.println("Volume of the cylinder: " + volume);

        scanner.close();
    }
}
