package Tutorial4;
public class CarArray {
    public static void main(String[] args) {
        String[][] cars = {
            {"Ferrai", "Red"},
            {"BMW", "Blue"},
            {"Mercedes", "Black"},
            {"Lambo", "Yellow"}
        };

        System.out.println("Available car brands and colors:");
        for (String[] car : cars) {
            System.out.println("Brand: " + car[0] + ", Color: " + car[1]);
        }
    }
}
