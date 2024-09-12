package LoopInJava;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();


        if (a <= 0 || b <= 0) {
            System.out.println("The given numbers is not valid");
        } else {
            int c = Math.max(a, b);
            int maxDivisor = 0;
            for (int i = 1; i < c; i++) {
                if (c % i == 0) {
                    if (maxDivisor < i) {
                        maxDivisor = i;
                    }
                }
            }
            System.out.println("The number " + maxDivisor + " is a greatest common divisor");
        }

    }
}
//        Nhập a = 0, b = 0
//        Nhập a = 0, b = 6
//        Nhập a = 6, b = 0
//        Nhập a = 3, b = 6
//        Nhập a = 6, b = 3