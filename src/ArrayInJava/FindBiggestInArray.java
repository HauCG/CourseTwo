package ArrayInJava;

import java.util.Scanner;

public class FindBiggestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;

        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("The array is too large.");
            }
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i+1) + " element: ");
            array[i] = sc.nextInt();
        }
        System.out.println("The bigget is: " + findBiggestInArray(array));
    }

    public static int findBiggestInArray(int[] arr) {
        int biggest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
