package ArrayInJava;

import java.util.Scanner;

public class DeleteElementInTheArray {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            //bắt dãy nhỏ hơn hoặc bằng 10
            System.out.println("Enter size of the array: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("The array is too large.");
            } else if (size < 1) {
                System.out.println("What kind of array is that ?");
            } else if (size == 1) {
                System.out.println("U sure your array just have one element?");
            }
        } while (size > 10 || size < 1);

        //khai báo khởi tạo dãy mới
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element in " + (i + 1) + " of array: ");
            array1[i] = sc.nextInt();
        }

        //hiển thị dãy mới
        System.out.print("Dãy ban đầu là : [");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        int key;
        do {
            //Nhập số để xóa
            System.out.println("Nhập số cần xóa: ");
            key = sc.nextInt();

            if (isFound(array1, key) == 0) {
                System.out.println("Không tìm thấy số");
            }
        } while (isFound(array1, key) == 0);


        int[] array2 = deleteKey(array1, key);
        System.out.print("New array: [");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }

    public static int isFound(int[] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                count++;
            }
        }
        return count;
    }

    public static int[] deleteKey(int[] array, int key) {
        int count = isFound(array, key);
        int[] newArray = new int[array.length - count];
        int j = 0; //new index
        for (int i = 0; i < array.length; i++) {
            if (array[i] != key) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}



