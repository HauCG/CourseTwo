package ArrayInJava;

import java.util.Scanner;

public class FindSumOfCollum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayOneSize;
        int arrayTwoSize;

        do {
            System.out.print("Enter the size of the array one: ");
            arrayOneSize = sc.nextInt();
            System.out.print("Enter the size of the array two: ");
            arrayTwoSize = sc.nextInt();
            if (arrayOneSize < 1 || arrayTwoSize < 1) {
                System.out.println("Invalid input");
            } else if (arrayOneSize  > 5 || arrayTwoSize > 5) {
                System.out.println("Invalid input");
            }
        } while (arrayOneSize < 1 || arrayTwoSize < 1 || arrayOneSize > 5 || arrayTwoSize > 5);

        int[] arrayOne = new int[arrayOneSize];
        int[] arrayTwo = new int[arrayTwoSize];

        for (int i = 0; i < arrayOneSize; i++) {
            System.out.print("Enter the " + (i+1) + "th element of array one: ");
            arrayOne[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayTwoSize; i++) {
            System.out.print("Enter the " + (i+1) + "th element of array two: ");
            arrayTwo[i] = sc.nextInt();
        }

        System.out.print("Array one: {");
        for (int i = 0; i < arrayOneSize; i++) {
            System.out.print(arrayOne[i]);
            if (i < arrayOneSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array two: {");
        for (int i = 0; i < arrayTwoSize; i++) {
            System.out.print(arrayTwo[i]);
            if (i < arrayTwoSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        int collumIndex;
        do {
            System.out.print("Enter index of collum your want to get sum result: ");
            collumIndex = sc.nextInt() - 1;
            if (collumIndex < 0 || collumIndex >= Math.max(arrayOneSize, arrayTwoSize)) {
                System.out.println("Enter the right index");
            }
        } while (collumIndex < 0 || collumIndex >= Math.max(arrayOneSize, arrayTwoSize));
        int sum = 0;
        if (arrayOneSize > arrayTwoSize) {
            if (collumIndex < arrayTwoSize) {
                sum += (arrayOne[collumIndex] + arrayTwo[collumIndex]);
            } else {
                sum = arrayOne[collumIndex];
            }
            System.out.println("Sum of columns is: " + sum);
        } else {
            if (collumIndex < arrayOneSize) {
                sum += (arrayTwo[collumIndex] + arrayOne[collumIndex]);
            } else {
                sum = arrayTwo[collumIndex];
            }
            System.out.println("Sum of columns is: " + sum);
        }
    }
}
