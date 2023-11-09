package Lecture3.Tutorial3;
public class MultiplesOf5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

