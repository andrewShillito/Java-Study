package Main;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numEntries = 0;

        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
            numEntries++;
            scanner.nextLine();
        }
        if (sum != 0) {
            double avg = (double) sum / numEntries;
            System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }
}
