package Lecture2;

import java.util.Scanner;

public class WeekdayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayName = getDayName(dayNumber);
        if (dayName != null) {
            System.out.println("Day " + dayNumber + " corresponds to " + dayName);
        } else {
            System.out.println("Invalid day number");
        }

        scanner.close();
    }

    public static String getDayName(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = null;
        }
        return dayName;
    }
}
