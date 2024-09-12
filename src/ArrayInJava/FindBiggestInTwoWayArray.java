package ArrayInJava;

import java.util.Scanner;

public class FindBiggestInTwoWayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sonSize;
        int girlSize;

        do {
                System.out.print("Enter first array Size: ");
            sonSize = sc.nextInt();
            System.out.print("Enter secound array Size: ");
            girlSize = sc.nextInt();
            if (sonSize > 3 || girlSize > 3 ) {
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

        if(findBiggestNumber(arrayGirl) > findBiggestNumber(arraySon)) {
            System.out.println("Biggest number is: " + findBiggestNumber(arrayGirl));
        } else {
            System.out.println("Biggest number is: " + findBiggestNumber(arraySon));
        }
    }

    public static int findBiggestNumber(int[] array) {
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }
}
