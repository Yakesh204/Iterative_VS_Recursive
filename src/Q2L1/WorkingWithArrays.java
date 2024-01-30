//Name: Yakesh Umachandran
//Student Number: 251303571
//Description: Identify time difference between iterative and recursive methods
package Q2L1;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkingWithArrays {
    public static void main(String[] args) {
        myHeader(2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers in array: ");//user sets size of array
        double[] numbers = new double[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {//fiil array with users numbers
            System.out.print("Enter Number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Here are the results...\n");
        double recArray[] = mma5MethodYakesh(numbers);//array to hold passed array
        if (recArray[3] != 0) {//if student number is not 0 print info out
            System.out.printf("The max is %.2f.\n" +
                    "The min is %.2f.\n" +
                    "The average of the ‘divisible by 5 numbers’ is %.2f.\n" +
                    "My student number is %.0f. \n", recArray[0], recArray[1], recArray[2], recArray[3]);
        }
        myFooter(2);
    }

    public static double[] mma5MethodYakesh(double[] array) {
        double average = 0;
        ArrayList<Double> divFive = new ArrayList<Double>();
        //fills array list with numbers divisable by 5
        for (double x : array) {
            if (x % 5 == 0) {
                divFive.add(x);
            }
        }
        //finds min and max in arraylist
        double min = divFive.get(0);
        double max = divFive.get(0);
        for (double y : divFive) {
            if (y < min) {
                min = y;
            }
            if (y > max) {
                max = y;
            }
        }
        //if the array list contains more than one elements find average and send array with all info
        //if array contains no elements send array with all 0's
        if (divFive.size() > 0) {
            for (double z : divFive) {
                average = average + z;
            }
            average = average / divFive.size();
            System.out.printf("Yakesh found %d number(s) that are divisible by 5\n", divFive.size());
            double[] info = {max, min, average, 251303571};
            return info;
        } else {
            System.out.printf("In this array, there were no numbers ‘divisible by 5’ and hence the average remains %.2f\n", average);
            double[] check = {0, 0, 0, 0};
            return check;
        }
    }

    public static void myHeader(int q) {//header information
        System.out.printf("=========================================================== \n" +
                "Lab Exercise 1-Q%d \n" +
                "Prepared By: Yakesh Umachandran\n" +
                "Student Number: 251303571\n" +
                "Goal of this Exercise: Using arrays and arraylists\n" +
                "===========================================================\n", q);
    }

    public static void myFooter(int q) {//foot information
        System.out.printf("=========================================================== \n" +
                "Completion of Lab Exercise 1-Q%d is successful!\n" +
                "Signing off - Yakesh\n" +
                "===========================================================\n", q);
    }
}
