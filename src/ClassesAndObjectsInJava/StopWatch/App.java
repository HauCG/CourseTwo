package ClassesAndObjectsInJava.StopWatch;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch clock = new StopWatch();
        int input;
        System.out.println("Press 1 to start the clock\n");
        do {
            input = sc.nextInt();
            if(input == 1) {
                clock.start();
                System.out.println(clock.startTime);
                System.out.println("Press 2 to stop the clock\n");
            } else if(input == 2) {
                clock.stop();
                System.out.println(clock.stopTime);
                System.out.println("Elapsed time in seconds is: " + (clock.getElapsedTime()/1000));
            }
        } while (input == 1);
    }
}
