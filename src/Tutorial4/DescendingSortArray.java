package Tutorial4;
import java.util.Arrays;

public class DescendingSortArray {
    public static void main(String[] args) {
        int[] numbers = {30, 15, 40, 10, 25};

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        System.out.println("Array in descending order: " + Arrays.toString(numbers));
    }
}
