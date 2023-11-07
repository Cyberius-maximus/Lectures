package Lecture2;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the original price of the product: $");
        double originalPrice = scanner.nextDouble();

        
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

       
        double discount = (originalPrice * discountPercentage) / 100;
        double discountedPrice = originalPrice - discount;

        
        double amountSaved = originalPrice - discountedPrice;

        
        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discounted Price: $" + discountedPrice);
        System.out.println("Amount Saved: $" + amountSaved);

        scanner.close();
    }
}

