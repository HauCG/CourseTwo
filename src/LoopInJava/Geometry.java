package LoopInJava;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choose = -1;
        Scanner scanner = new Scanner(System.in);
        while (choose != 0) {
            System.out.print("1. Draw the triangle\n" +
                    "2. Draw the square\n"
                    + "3. Draw the rectangle\n"
                    + "4. Exit\n" +
                    "Enter your choice: ");

            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("  0\n" + " 000\n" + "00000\n");
                    break;
                case 2:
                    System.out.print("00000\n" + "0   0\n" + "0   0\n" + "00000\n");
                    break;
                case 3:
                    System.out.print("000000\n" + "0    0\n" + "000000\n");
                    break;
                    case 4:
                        System.exit(0);
            }
        }

    }
}
