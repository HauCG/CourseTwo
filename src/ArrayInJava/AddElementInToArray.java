package ArrayInJava;

import java.util.Scanner;

public class AddElementInToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập độ lớn của dãy : ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("To vậy à? Ask your mother!");
            } else if (size < 1) {
                System.out.println("Dãy kiểu gì đấy ?");
            }
        }
        while (size > 10 || size < 1);
        int[] oldArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập số ở vị trí thứ " + (i+1) + " là: ");
            oldArray[i] = sc.nextInt();
        }

        System.out.print("Dãy cũ là is: [");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.print(oldArray[i]);
            if (i < oldArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        int index;
        do {
            System.out.print("Nhập vị trí mà bạn muốn thêm vào: ");
             index = sc.nextInt();
            if (index  <= 0 || index > oldArray.length) {
                System.out.print("Nhập index trong khoảng từ 1 đến " + oldArray.length);
            }
        } while (index  <= 0 || index > oldArray.length);

        System.out.print("Nhập số mà bạn muốn thêm vào: ");
        int key = sc.nextInt();
        int[] newArray = new int[oldArray.length + 1];


//gán dãy cũ với dãy mới giống nhau
        for (int i = 0; i < index - 1; i++) {
            newArray[i] = oldArray[i];
        }
        //thay số mối vào newarray
        newArray[index-1] = key;

//        từ vị trí của số mới đến cuối  độ dài của mảng mới  lấy các số của dãy cũ vào dãy mới
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = oldArray[i-1];
        }



        System.out.print("Dãy mới là : [");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
