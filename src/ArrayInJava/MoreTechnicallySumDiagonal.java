package ArrayInJava;

import java.util.Scanner;

public class MoreTechnicallySumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.print("Enter the size of square matrix array: ");
            size = sc.nextInt();
            if (size >= 10) {
                System.out.println("So big do it your self :V");
            } else if (size <1 ) {
                System.out.println("What kind of array was that ;V");
            }
        } while (size >= 10 || size < 1);

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter index "+ i + " of array " + j + " is : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("{");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");
            if (i < matrix.length - 1) {
                System.out.println(",");
            }
        }
        System.out.println("}");

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.print("Sum is : " + sum);
    }
}
