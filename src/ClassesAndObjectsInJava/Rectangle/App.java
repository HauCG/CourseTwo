package ClassesAndObjectsInJava.Rectangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int height = sc.nextInt();

        Rectangle h1 = new Rectangle(width,height);
        System.out.println(h1.getArea());
        System.out.println(h1.getPerimeter());
        System.out.println(h1.display());

    }
}
