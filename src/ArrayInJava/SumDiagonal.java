package ArrayInJava;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sonSize;
        int girlSize;

        do {
            System.out.print("Enter first array Size: ");
            sonSize = sc.nextInt();
            System.out.print("Enter secound array Size: ");
            girlSize = sc.nextInt();
            if (sonSize > 3 || girlSize > 3) {
                System.out.println("SIZE > 3 ??? HUD? Do it your self :v");
            } else if (sonSize < 1 || girlSize < 1) {
                System.out.println("SIZE < 1 ??? Are you dumb? ");
            }
        } while (sonSize > 3 || girlSize > 3 || sonSize < 1 || girlSize < 1);

        int[] arraySon = new int[sonSize];
        for (int i = 0; i < sonSize; i++) {
            System.out.print("Enter index " + i + " of array one : ");
            arraySon[i] = sc.nextInt();
        }

        int[] arrayGirl = new int[girlSize];
        for (int i = 0; i < girlSize; i++) {
            System.out.print("Enter index " + i + " of array two : ");
            arrayGirl[i] = sc.nextInt();
        }

        System.out.print("Array one: {");
        for (int i = 0; i < arraySon.length; i++) {
            System.out.print(arraySon[i]);
            if (i < arraySon.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array two: {");
        for (int i = 0; i < arrayGirl.length; i++) {
            System.out.print(arrayGirl[i]);
            if (i < arrayGirl.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        int[][] arrayThree = new int[2][];
        arrayThree[0] =  arraySon;
        arrayThree[1] =  arrayGirl;

        int sum = 0;
        int minArraySize = Math.min(arrayThree[0].length, arrayThree[1].length);
        for (int i = 0; i < 2; i++) {
            sum += arrayThree[i][i];
        }
        System.out.println("Sum: " + sum);
        System.out.println(minArraySize);
    }
}
