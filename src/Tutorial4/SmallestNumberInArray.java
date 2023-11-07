package Tutorial4;
public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {30, 15, 40, 10, 25};
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Smallest number in the array: " + smallest);
    }
}
