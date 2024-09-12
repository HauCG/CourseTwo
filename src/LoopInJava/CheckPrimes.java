package LoopInJava;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        if (num > 1) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if(num % i == 0) {
                    System.out.println(num + " isn't a prime number");
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(num + " is a prime number");
            }
        } else {
            System.out.println("Not a prime number");
        }
    }
}
