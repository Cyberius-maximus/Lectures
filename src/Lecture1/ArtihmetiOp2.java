package Lecture1;
import java.util.Scanner;// universalle klassen mit extra funktionen damit man sie nicht jedesmal selber programmieren muss  online kann man dan nachschauen welche methoden usw in den klassen sind.
public class ArtihmetiOp2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);// damit erstellt man eine scanner klasse
    System.out.print("Enter the first number: ");
    int n1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int n2 = scanner.nextInt();
    scanner.close();
    System.out.println("Addition: " + (n1+n2));
    System.out.println("Subtraction: " + (n1-n2));
    System.out.println("Multiplication: " + (n1*n2));
    System.out.println("Division: " + (n1/n2));
    System.out.println("Modulus: " + (n1%n2));
    System.out.println("Exponentiation : " + (n1^n2));


}
}