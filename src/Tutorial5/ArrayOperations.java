package Tutorial5;
public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ArrayCreation();
        ArrayDisplay(arr);
        System.out.println("Average: " + avgArray(arr));
        System.out.println("Sum: " + SumArray(arr));
    }

    static void ArrayCreation() {
        System.out.println("Array creation method called.");
    }

    static void ArrayDisplay(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static double avgArray(int[] arr) {
        int sum = SumArray(arr);
        return (double) sum / arr.length;
    }

    static int SumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
