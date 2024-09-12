package ArrayInJava;

import java.util.Scanner;

public class FindMinInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("The array is too large.");
            }
        } while (size > 10);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Min of the array is: " + findMin(arr) );
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
