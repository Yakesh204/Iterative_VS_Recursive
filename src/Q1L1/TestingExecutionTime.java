//Name: Yakesh Umachandran
//Student Number: 251303571
//Description: Identify time difference between iterative and recursive methods
package Q1L1;
import java.util.Scanner;

public class TestingExecutionTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //new scanner instance
        myHeader(1); // calling header method
        int input;
        while(true){//getting integer number above 0
            System.out.printf("Enter an integer number: ");
             input = scanner.nextInt();
            if (input >=0){
                break;
            }
        }
        //getting current time
        double currentTime = System.nanoTime();
        double answer = 1;//iterative way of finding factorial
        for (int i = 1; i <= input; i++) {
            answer = answer * i;
        }
        System.out.printf("Factorial (%d) is %.0e\n" +//printing out answer and getting current time to find difference between times
                "Time taken by iterative solution inside main: %.2e secs\n",input, answer, (System.nanoTime() - currentTime)/1000000000);
        currentTime = System.nanoTime();//prinitng info and finding time difference for different methods
        System.out.printf("Factorial (%d) with iterative method is %.0e\n" +
                "Time taken by iterative method: %.2e secs\n",input, iterativeMethodForFactorial(input), (System.nanoTime() - currentTime)/1000000000);
        currentTime = System.nanoTime();//prinitng info and finding time difference for different methods
        System.out.printf("Factorial (%d) with recursive method is %.0e\n" +
                "Time taken by recursive method: %.2e secs\n",input, recursiveMethodForFactorial(input), (System.nanoTime() - currentTime)/1000000000);
        myFooter(1);//calling footer
    }

    public static void myHeader(int q) {//method printing out header
        System.out.printf("=========================================================== \n" +
                "Lab Exercise 1-Q%d \n" +
                "Prepared By: Yakesh Umachandran\n" +
                "Student Number: 251303571\n" +
                "Goal of this Exercise: Identify time difference between\n" +
                "iterative and recursive methods\n" +
                "===========================================================\n", q);
    }

    public static void myFooter(int q) {//method printing out footer
        System.out.printf("=========================================================== \n" +
                "Completion of Lab Exercise 1-Q%d is successful!\n" +
                "Signing off - Yakesh\n" +
                "===========================================================\n", q);
    }

    public static double iterativeMethodForFactorial(int inp) {
        //iterative method of finding factorial
        double result = 1;
        for (int i = 1; i <= inp; i++) {
            result = result * i;
        }
        return result;
    }

    public static double recursiveMethodForFactorial(int inp) {
        //recursive method of finding factorial
        if (inp == 0) {
            return 1;
        } else {
            return inp * recursiveMethodForFactorial(inp - 1);
        }
    }
}
