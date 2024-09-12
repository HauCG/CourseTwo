package ClassesAndObjectsInJava.QuadraticEquation;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax2 + bx + x = 0");
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        QuadraticEquation q1 = new QuadraticEquation(a, b, x);

        double alpha = q1.getDiscriminant(a,b,x);
//        System.out.println(alpha);

        if (alpha > 0 ) {
            System.out.println(q1.getRoot1());
            System.out.println(q1.getRoot2());
        } else if (alpha == 0) {
            System.out.println(q1.getRoot3());
    } else if (alpha < 0) {
            System.out.println(q1.getNoRoot());
        }
    }
}
