package LoopInJava;

import java.util.Scanner;

public class ShowGeometry {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle\n" +
                "\n" +
                "2. Print the square triangle\n" +
                "\n" +
                "3. Print isosceles triangle\n" +
                "\n" +
                "4. Exit\n" +
                "Choose your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                System.out.println("Enter short size");
                int x1 = sc.nextInt();
                System.out.println("Enter long size");
                int y1 = sc.nextInt();

                for (int i = 1; i <= x1; i++) {
                    if (i == 1 || i == x1) {
                        for (int j = 1; j <= y1; j++) {
                            System.out.print("*");
                        }
                    } else {
                        for (int j = 1; j <= y1; j++) {
                            if (j == 1 || j == y1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        ;
                    }
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                System.out.println("Enter one side");
                int x2 = sc.nextInt();
                System.out.println("Down Left Square");
                for (int i = 1; i <= x2; i++) {
                    System.out.println("\n");
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println("\n");

                System.out.println("Top Left Square");
                for (int i = 1; i <= x2; i++) {
                    System.out.println("\n");
                    for (int j = x2 - i; j >= 0; j--) {
                        System.out.print("*");
                    }
                }
                System.out.println("\n");

                System.out.println("Top Right Square");
                for (int i = 0; i < x2; i++) {
                    System.out.println("\n");
                    for (int j = 1; j <= x2; j++) {
                        if (i < j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("\n");

                System.out.println("Bottom Right Square");
                for (int i = 1; i <= x2; i++) {
                    System.out.println("\n");
                    for (int j = x2; j >= 0; j--) {
                        if (i > j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Print the isosceles triangle");
                System.out.println("Enter one side");
                int x3 = sc.nextInt();
                for (int i = 1; i <= x3; i++) {
                    for (int j = x3; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
                case 4:
                    System.exit(0);
        }
    }
}

