package ArrayInJava;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArrrayOne;
        int sizeArrrayTwo;
        do {
            System.out.print("Enter the size of the array one: ");
            sizeArrrayOne = sc.nextInt();
            System.out.print("Enter the size of the array two: ");
            sizeArrrayTwo = sc.nextInt();
            if(sizeArrrayOne <= 0 || sizeArrrayTwo <= 0 || sizeArrrayOne >= 10  || sizeArrrayTwo >= 10) {
                System.out.println("Enter array that under 10 elements and over 0");
            }
        } while (sizeArrrayOne <= 0 || sizeArrrayTwo <= 0 || sizeArrrayOne >= 10  || sizeArrrayTwo >= 10);

        if(sizeArrrayOne > 0 && sizeArrrayTwo > 0 && sizeArrrayOne < 10  && sizeArrrayTwo < 10) {
            // khai báo và gọi mảng 1
            int[] arrOne = new int[sizeArrrayOne];
            for (int i = 0; i < sizeArrrayOne; i++) {
                System.out.print("Enter the number at in dex = " + i + " of array 1 : ");
                arrOne[i] = sc.nextInt();
            }
            System.out.print("Array one : [");
            for (int i = 0; i < sizeArrrayOne; i++) {
                System.out.print(arrOne[i]);
                if (arrOne[i] < sizeArrrayOne) {
                    System.out.print(",");
                    ;
                }
            }
            System.out.println("]");

            // khai báo và gọi hàm 2
            int[] arrTwo = new int[sizeArrrayTwo];
            for (int i = 0; i < sizeArrrayTwo; i++) {
                System.out.print("Enter the number at in dex = " + i + " of array 2 : ");
                arrTwo[i] = sc.nextInt();
            }
            System.out.print("Array two : [");
            for (int j = 0; j < sizeArrrayTwo; j++) {
                System.out.print(arrTwo[j]);
                if (arrTwo[j] < sizeArrrayTwo) {
                    System.out.print(",");
                }
            }
            System.out.println("]");


            //khai báo mảng thứ 3
            int[] arrThree = new int[sizeArrrayTwo + sizeArrrayOne];
            for (int i = 0; i < arrOne.length; i++) {
                arrThree[i] = arrOne[i];
            }
            for (int i = arrOne.length; i < arrThree.length; i++) {
                arrThree[i] = arrTwo[i - arrOne.length];
            }

            System.out.print("Array three: [");
            for (int i = 0; i < arrThree.length; i++) {
                System.out.print(arrThree[i]);
                if (arrThree[i] < arrThree.length) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
}
