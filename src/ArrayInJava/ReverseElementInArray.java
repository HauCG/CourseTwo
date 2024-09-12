package ArrayInJava;

import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter array length");
            size = sc.nextInt();
            if (size >= 20) {
                System.out.println("Array length is less than 20");
            }
        } while (size >= 20);

        int[] array1 = new int[size];
            for (int i = 0; i < array1.length; i++) {
                System.out.println("Enter element " + (i + 1) + " is: ");
                array1[i] = sc.nextInt();
            }


        System.out.print("Array1: [");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        int[] array2 = reverseElementInArray(array1);
        System.out.print("Array2: [");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static int[] reverseElementInArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

}
